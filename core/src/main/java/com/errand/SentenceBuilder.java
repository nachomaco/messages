package com.errand;

import com.errand.processors.EnglishProcessor;

public class SentenceBuilder extends SentenceData implements Noun, PreNoun, Sentence {
	
	private Conjunction conjunction;
	
	private boolean required = false;
	private boolean negate = false;
	private Verb verb;

	private final Processor processor;
	
	
	public SentenceBuilder(Processor processor) {
		super();
		if (processor==null) {
			this.processor = new EnglishProcessor();			
		} else {
			this.processor = processor;
		}
	}
	
	
	// START
	//--------------------------------------------------------------------
	
//	@Override
	public PreNoun the() {
		return (PreNoun) the(null, null);
	}
//	@Override
	public <T> Noun the(T noun) {
		return the(noun, null);
	}

//	@Override
	public <T> Noun the(T noun, String code) {
		return the(noun.getClass(), code);
	}

//	@Override
	public <T> Noun the(Class<T> noun) {
		return the(noun, null);
	}
	
//	@Override
	public <T> Noun the(Class<T> noun, String code) {
		add(processor.the(), noun, code, conjunction);
		conjunction = null;
		return this;
	}


	
	
//	@Override
	public PreNoun a() {
		return (PreNoun) a(null);
	}
	
//	@Override
	public <T> Noun a(T noun) {
		return a(noun.getClass());
	}


//	@Override
	public <T> Noun a(Class<T> noun) {
		add(processor.a(), noun, null, conjunction);
		conjunction = null;
		return this;
	}
	
	// PRENOUN
	//--------------------------------------------------------------
	@Override
	public <T> Noun selected(T noun) {
		return selected(noun.getClass());
	}

	@Override
	public <T> Noun selected(Class<T> noun) {
		setNoun(noun);
		return this;
	}
	


	
	// NOUN
	//--------------------------------------------------------------------
		
	@Override
	public PreNoun andThe() {
		return (PreNoun) andThe(null, null);
	}


	@Override
	public <T> Noun andThe(T noun) {
		return andThe(noun, null);
	}


	@Override
	public <T> Noun andThe(Class<T> noun) {
		return andThe(noun, null);
	}


	@Override
	public <T> Noun andThe(T noun, String code) {
		return andThe(noun.getClass(), code);
	}


	@Override
	public <T> Noun andThe(Class<T> noun, String code) {
		conjunction = Conjunction.AND;
		return the(noun, code);
	}


	@Override
	public PreNoun andA() {
		return (PreNoun) andA(null);
	}


	@Override
	public <T> Noun andA(T noun) {
		return andA(noun.getClass());
	}


	@Override
	public <T> Noun andA(Class<T> noun) {
		conjunction = Conjunction.AND;
		return a(noun);
	}
	
	@Override
	public PreNoun orThe() {
		return (PreNoun) orThe(null, null);
	}


	@Override
	public <T> Noun orThe(T noun) {
		return orThe(noun, null);
	}


	@Override
	public <T> Noun orThe(Class<T> noun) {
		return orThe(noun, null);
	}


	@Override
	public <T> Noun orThe(T noun, String code) {
		return orThe(noun.getClass(), code);
	}


	@Override
	public <T> Noun orThe(Class<T> noun, String code) {
		conjunction = Conjunction.OR;
		return the(noun, code);
	}


	@Override
	public PreNoun orA() {
		return (PreNoun) orA(null);
	}


	@Override
	public <T> Noun orA(T noun) {
		return orA(noun.getClass());
	}


	@Override
	public <T> Noun orA(Class<T> noun) {
		conjunction = Conjunction.OR;
		return a(noun);
	}


	@Override
	public Noun not() {
		this.negate = true;
		return this;
	}
	


	@Override
	public Sentence updated() {
		this.verb = Verb.UPDATE;
		return this;
	}

	@Override
	public Sentence deleted() {
		this.verb = Verb.DELETE;
		return this;
	}

	

	@Override
	public Sentence created() {
		this.verb = Verb.CREATE;
		return this;
	}

	@Override
	public Sentence uploaded() {
		this.verb = Verb.UPLOAD;
		return this;
	}

	@Override
	public Sentence copied() {
		this.verb = Verb.COPY;
		return this;
	}

	@Override
	public Sentence unsuscribed() {
		this.verb = Verb.UNSUSCRIBE;
		return this;
	}

	@Override
	public Sentence associated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sentence alreadyExist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sentence required() {
		required = true;
		return this;
	}


	public String translate() {
		return "the ";
	}
	

}
