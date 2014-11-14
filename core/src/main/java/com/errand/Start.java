package com.errand;

public interface Start {
	
	PreNoun the();
	<T> Noun the(T noun);
	<T> Noun the(Class<T> noun);
	<T> Noun the(T noun, String code);
	<T> Noun the(Class<T> noun, String code);
	
	PreNoun a();
	<T> Noun a(T noun);
	<T> Noun a(Class<T> noun);
	
//	<T> Noun exist(T noun);
//	<T> Noun notExist(T noun);
//	<T> Noun other(T noun);
//	<T> Noun several(T noun);
}
