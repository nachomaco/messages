package com.errand;

public class The<T> implements Subject {
	
	private final Class<T> noun;
	private final String code;
	
	public The(Class<T> noun) {
		this.noun = noun;
		this.code = null;
	}
	
	public The(Class<T> noun, String code) {
		this.noun = noun;
		this.code = code;
	}

	public String translate() {
		return "the " + noun.getSimpleName().toLowerCase()
				+ (code==null ? "" : " \"" + code + "\"");
	}
	

}
