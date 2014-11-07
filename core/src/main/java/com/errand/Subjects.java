package com.errand;

public class Subjects<T> {
	
	public static <T> The<T> the(T noun) {
		return new The<T>((Class<T>) noun.getClass());
	}
	
	public static <T> The<T> the(T noun, String code) {
		return new The<T>((Class<T>) noun.getClass(), code);
	}

	public static <T> The<T> the(Class<T> noun) {
		return new The<T>(noun);
	}
	
}
