package com.errand.processors;

import java.util.Map;

import com.errand.Article;
import com.errand.GrammaticalGender;
import com.errand.GrammaticalNumber;
import com.errand.Processor;
import com.errand.SentenceData;
import com.errand.Translation;

public class SpanishProcessor implements Processor {
	

	private Map<String, Translation> translations;
	
	public String translate(SentenceData data) {
		return getSubject(data);
	}
	
	private String getSubject(SentenceData data) {
		Translation t = translations.get(data.getFirstNoun().getNoun());
		return data.getFirstNoun().getArticle().get(t.gender(), t.number())
				+ t.translation();
	}
	
	
	private enum EsArticle implements Article {
		THE{
			@Override
			public String get(GrammaticalGender gender, GrammaticalNumber number) {
				return "el";
			}
		}, A {
			@Override
			public String get(GrammaticalGender gender, GrammaticalNumber number) {
				return "un";
			}
		};
	}

	@Override
	public Article the() {
		return EsArticle.THE;
	}

	@Override
	public Article a() {
		return EsArticle.A;
	}
}
