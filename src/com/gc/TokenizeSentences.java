package com.gc;

import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class TokenizeSentences {
//
public static void main(String[] args) {
//		String paragraph = "My 1st sentence. “Does it work for questions?” My third sentence.";
//		Reader reader = new StringReader(paragraph);
//		DocumentPreprocessor dp = new DocumentPreprocessor(reader);
//		List<String> sentenceList = new ArrayList<String>();
//		for (List<HasWord> sentence : dp) {
//			String sentenceString = Sentence.listToString(sentence);
//			sentenceList.add(sentenceString.toString());
//		}
//
//		for (String sentence : sentenceList) {
//			System.out.println(sentence);
//		}
//	}

//creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution 
Properties props = new Properties();
props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

//read some text in the text variable
String text = "";

//create an empty Annotation just with the given text
Annotation document = new Annotation(text);

//run all Annotators on this text
pipeline.annotate(document);

//these are all the sentences in this document
//a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
List<CoreMap> sentences = document.get(SentencesAnnotation.class);

for(CoreMap sentence: sentences) {
// traversing the words in the current sentence
// a CoreLabel is a CoreMap with additional token-specific methods
for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
 // this is the text of the token
 String word = token.get(TextAnnotation.class);
 // this is the POS tag of the token
 String pos = token.get(PartOfSpeechAnnotation.class);
 // this is the NER label of the token
 String ne = token.get(NamedEntityTagAnnotation.class);  
 System.out.println(word);
 System.out.println(pos);
 System.out.println(ne);
}
}
}}