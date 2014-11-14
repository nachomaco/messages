package com.errand;

import java.util.ArrayList;
import java.util.List;

public class SentenceData {

	private NounData firstNoun;
	private List<NounData> moreNouns;
	
	
	
	protected <T> void add(Article article, Class<T> noun, String code, Conjunction conjunction) {
		if (conjunction!=null) {
			if (moreNouns==null) {
				moreNouns = new ArrayList<>();
			}
			moreNouns.add(new NounData(conjunction, article, noun, code));
		} else {
			firstNoun = new NounData(article, noun, code);	
		}
	}
	
	protected <T> void setNoun(Class<T> noun) {
		if (moreNouns==null) {
			firstNoun.setNoun(noun);	
		} else {
			moreNouns.get(moreNouns.size()-1).setNoun(noun);
		}
	}
	
	public NounData getFirstNoun() {
		return firstNoun;
	}
	
	public List<NounData> getMoreNouns() {
		return moreNouns;
	}
	
	
	
}
