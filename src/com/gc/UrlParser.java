package com.gc;

import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;


public class UrlParser {
	//private static String webAddress; // = url 
	public static String webPageHTML;
	
	public static  String ParseUrl (String webAddress) throws IOException {	
	
		Document doc = Jsoup.connect(webAddress).get();
		webPageHTML = doc.html();
		return webPageHTML;
}

public static void main (String [] args) throws IOException {
	System.out.println(ParseUrl("https://medium.com/matter/there-s-nothing-banning-sports-would-solve-that-banning-humans-entirely-wouldn-t-solve-better-39bb418a6b50"));
}

}
