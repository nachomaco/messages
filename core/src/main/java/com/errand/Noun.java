package com.errand;


public interface Noun {
	
	PreNoun andThe();
	<T> Noun andThe(T noun);
	<T> Noun andThe(Class<T> noun);
	<T> Noun andThe(T noun, String code);
	<T> Noun andThe(Class<T> noun, String code);
	
	PreNoun andA();
	<T> Noun andA(T noun);
	<T> Noun andA(Class<T> noun);
	
	PreNoun orThe();
	<T> Noun orThe(T noun);
	<T> Noun orThe(Class<T> noun);
	<T> Noun orThe(T noun, String code);
	<T> Noun orThe(Class<T> noun, String code);
	
	PreNoun orA();
	<T> Noun orA(T noun);
	<T> Noun orA(Class<T> noun);

	Noun not();
	Sentence created();
	Sentence updated();
	Sentence deleted();
	
	Sentence uploaded();
	Sentence copied();
	
	Sentence unsuscribed();
	
	Sentence associated();
	Sentence alreadyExist();
	
	Sentence required();
	
	
}
