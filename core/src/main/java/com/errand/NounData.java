package com.errand;

public class NounData {
	private final Article article;
	private Class<?> noun;
	private final String code;
	
	private final Conjunction conjunction;
	
	public NounData(Article article, Class<?> noun) {
		this(article, noun, null);
	}
	
	public NounData(Article article, Class<?> noun, String code) {
		this(null, article, noun, code);
	}

	public NounData(Conjunction conjunction, Article article, Class<?> noun, String code) {
		super();
		this.conjunction = conjunction;
		this.article = article;
		this.noun = noun;
		this.code = code;
	}

	public Class<?> getNoun() {
		return noun;
	}

	public void setNoun(Class<?> noun) {
		this.noun = noun;
	}

	public String getCode() {
		return code;
	}

	public Article getArticle() {
		return article;
	}

	public Conjunction getConjunction() {
		return conjunction;
	}

	
	
}