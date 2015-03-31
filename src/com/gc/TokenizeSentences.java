package com.gc;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;

public class TokenizeSentences {

  public static void main(String[] args) throws IOException {
    for (String arg : args) {
      // option #1: By sentence.
//      DocumentPreprocessor dp = new DocumentPreprocessor(arg);
//      for (List sentence : dp) {
//        System.out.println(sentence);
//      }
      // option #2: By token
      PTBTokenizer ptbt = new PTBTokenizer(new FileReader(arg),
              new CoreLabelTokenFactory(), "");
      for (CoreLabel label; ptbt.hasNext(); ) {
        label = ptbt.next();
        System.out.println(label);
      }
    }
  }
}
// //creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER,
// parsing, and coreference resolution
// Properties props = new Properties();
// props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
// StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
//
// //read some text in the text variable
// String text = "";
//
// //create an empty Annotation just with the given text
// Annotation document = new Annotation(text);
//
// //run all Annotators on this text
// pipeline.annotate(document);
//
// //these are all the sentences in this document
// //a CoreMap is essentially a Map that uses class objects as keys and has
// values with custom types
// List<CoreMap> sentences = document.get(SentencesAnnotation.class);
//
// for(CoreMap sentence: sentences) {
// // traversing the words in the current sentence
// // a CoreLabel is a CoreMap with additional token-specific methods
// for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
// // this is the text of the token
// String word = token.get(TextAnnotation.class);
// // this is the POS tag of the token
// String pos = token.get(PartOfSpeechAnnotation.class);
// // this is the NER label of the token
// String ne = token.get(NamedEntityTagAnnotation.class);
// System.out.println(word);
// System.out.println(pos);
// System.out.println(ne);
// }

