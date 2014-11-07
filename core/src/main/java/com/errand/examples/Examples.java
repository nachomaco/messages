package com.errand.examples;

import static com.errand.Subjects.*;
import static com.errand.Actions.*;
import static com.errand.Dictionary.*;

public class Examples {
	
	public static void main (String[] args) {
		Invoice i = new Invoice();
		System.out.println(the(i, i.code).translate());
		System.out.println(the(Contract.class).translate());
		
		System.out.println(translate(the(i), updated()));
		System.out.println(translate(the(i, i.code), deleted()));
		System.out.println(translate(the(Contract.class), deleted()));
		
	}
	
	
	public static class Invoice {
		String code = "33/2015";
	}
	
	public class Contract {
		
	}

}
