package com.errand;

import com.errand.actions.Delete;
import com.errand.actions.Update;

public class Actions {

	public static Predicate updated() {
		return new Update();
	}
	
	public static Predicate deleted() {
		return new Delete();
	}
	
	
}
