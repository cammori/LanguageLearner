package com.gc;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.process.DocumentPreprocessor;

public class TokenizeSentences {
	String paragraph = "My 1st sentence. “Does it work for questions?” My third sentence.";
	Reader reader = new StringReader(paragraph);
	DocumentPreprocessor dp = new DocumentPreprocessor(reader);
	List <String> sentenceList = new ArrayList<String>();

	for (List<HasWord> sentence1 : dp) {
	   String sentenceString = Sentence.listToString(sentence1);
	   sentenceList.add(sentenceString.toString());
	}

	for (String sentence : sentenceList) {
	   System.out.println(sentence1);
	}
	
	// 	HashMap<Integer, String> tokenizedSentences = new HashMap<Integer, String>();
	// public String[] sentenceTokenizer(String HTMLParagraphs) {
//		//Take HTMLParagraphs to 
//		return null;
//
//	}
}}
