package com.errand.processors;

import com.errand.Article;
import com.errand.GrammaticalGender;
import com.errand.GrammaticalNumber;
import com.errand.Processor;

public class EnglishProcessor implements Processor {
	
	private enum EnArticle implements Article {
		THE, A;

		@Override
		public String get(GrammaticalGender gender, GrammaticalNumber number) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	@Override
	public Article the() {
		return EnArticle.THE;
	}

	@Override
	public Article a() {
		return EnArticle.A;
	}

}
