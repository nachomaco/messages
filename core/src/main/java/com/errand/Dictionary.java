package com.errand;

public class Dictionary {
	
	public static String translate(Subject subject, Predicate predicate) {
		return subject.translate() + " has been " + predicate.translate();
	}

}
