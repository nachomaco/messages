package com.errand;

import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PropertiesDictionary implements Dictionary {

	private static final String GENDER = ".gender";
	
	private ConcurrentMap<String, Translation> dictionary = new ConcurrentHashMap<String, Translation>();
	
	PropertiesDictionary(ResourceBundle bundle) {
		load(bundle);
	}
	
	@Override
	public Translation getTranslation(String noun) {
		return dictionary.get(noun);
	}


	private void load(ResourceBundle bundle) {
		for (String key: bundle.keySet()) {
			if (isEntity(key)) {
				dictionary.put(key, getTranslation(bundle, key));
			}
		}
	}

	private Translation getTranslation(ResourceBundle bundle, String key) {
		String translation = bundle.getString(key);
		GrammaticalGender gg = null;
		String genderKey = key + GENDER;
		if (bundle.containsKey(genderKey)) {
			String gender = bundle.getString(genderKey);
			if (gender!=null) {
				gg = GrammaticalGender.valueOf(gender);
			}
		} 
		
		return new TranslationImpl(translation, gg);
	}

	private boolean isEntity(String key) {
		return !key.endsWith(GENDER);
	}

}
