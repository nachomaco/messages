package com.errand.examples;

import java.util.Locale;
import java.util.ResourceBundle;

import com.errand.DSL;
import com.errand.Start;

public class Examples {
	
	public static void main (String[] args) {
		
		ResourceBundle.getBundle("dictionary");
		ResourceBundle.getBundle("dictionary", Locale.forLanguageTag("es"));
		
		Start d = DSL.using();
		Invoice i = new Invoice();
		
		d.the(i, i.code);
		d.the(Contract.class, "code");
		d.the().selected(i);
		
		d.a(i);
		d.a(Contract.class);
				
		d.the(i).andThe().selected(Contract.class).andThe(i);
		d.a(i).orA(Contract.class).orA(i);
		
//		System.out.println(d.the(i, i.code).translate());
//		System.out.println(d.the(Contract.class).translate());
		
		System.out.println(d.the(i).updated().translate());
		System.out.println(d.the(i, i.code).deleted().translate());
		System.out.println(d.the(Contract.class).deleted().translate());
		
		
		d.the(i).deleted();
		
	}
	
	
}
