package com.errand.examples;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

import com.errand.DSL;
import com.errand.Start;
import com.errand.processors.EnglishProcessor;
import com.errand.processors.SpanishProcessor;

public class PropertiesTest {
	
	@Test
	public void test() {
		Start start = DSL.using(new SpanishProcessor(), ResourceBundle.getBundle("dictionary", Locale.forLanguageTag("es")));
		start.the(Invoice.class);
		
	}
	
	@Test
	public void test_default_locale() {
		Start start = DSL.using(new EnglishProcessor(), ResourceBundle.getBundle("dictionary"));
		start.the(Invoice.class);
	}
	
	

}
