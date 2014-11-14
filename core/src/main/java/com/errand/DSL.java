package com.errand;

import java.util.ResourceBundle;

public class DSL implements Start {
	
	private static final Dictionary defaultDictionary = new DefaultDictionary();
	
	private final Processor processor;
	private final Dictionary dictionary;
	
	
	
	public DSL(Processor processor, Dictionary dictionary) {
		this.processor = processor;
		this.dictionary = dictionary;
	}

	public static Start using() {
		return using(null, defaultDictionary);
	}
	
	public static Start using(Processor processor) {
		return using(processor, defaultDictionary);
	}
	
	public static Start using(Processor processor, ResourceBundle bundle) {
		return using(processor, new PropertiesDictionary(bundle));
	}
	
	public static Start using(Processor processor, Dictionary dictionary) {
		return new DSL(processor, dictionary);
	}
	
	public Start error() { // ha ocurrido un error.
		return null;
	}
	
	public Start correct()  { // para añadir correctamente.
		return null;
	}

	@Override
	public PreNoun the() {
		return new SentenceBuilder(processor).the();
	}

	@Override
	public <T> Noun the(T noun) {
		return new SentenceBuilder(processor).the(noun);
	}

	@Override
	public <T> Noun the(Class<T> noun) {
		return new SentenceBuilder(processor).the(noun);
	}

	@Override
	public <T> Noun the(T noun, String code) {
		return new SentenceBuilder(processor).the(noun, code);
	}

	@Override
	public <T> Noun the(Class<T> noun, String code) {
		return new SentenceBuilder(processor).the(noun, code);
	}

	@Override
	public PreNoun a() {
		return new SentenceBuilder(processor).a();
	}

	@Override
	public <T> Noun a(T noun) {
		return new SentenceBuilder(processor).a(noun);
	}

	@Override
	public <T> Noun a(Class<T> noun) {
		return new SentenceBuilder(processor).a(noun);
	}

	
}
