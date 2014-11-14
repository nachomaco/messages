package com.errand;

public class TranslationImpl implements Translation {
	private final String translation;
	private final GrammaticalGender gender;
	
	TranslationImpl(String translation, GrammaticalGender gender) {
		this.translation = translation;
		this.gender = gender;
	}
	
	@Override
	public GrammaticalGender gender() {
		return gender;
	}
	@Override
	public GrammaticalNumber number() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String translation() {
		return translation;
	}
	

}
