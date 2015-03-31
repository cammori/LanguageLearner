package com.gc;

public class TokenizeSentences {
	public static void main(String[] args) {
		String str = "This is how I tried to split a paragraph into a sentence. But, there is a problem. My paragraph includes dates like Jan. 13, 2014, words like U.S. and numbers like 2.2 at the end of the sentence. They all got splitted by the above code.";
		String[] sentences = str.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
		for (int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
		}
	}
}