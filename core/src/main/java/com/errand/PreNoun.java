package com.errand;

public interface PreNoun {

	<T> Noun selected(T noun);
	<T> Noun selected(Class<T> noun);
}
