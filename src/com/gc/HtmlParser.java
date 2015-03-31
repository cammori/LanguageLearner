package com.gc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParser {

	public static String ParseHtml() {
		// Document html = Jsoup.parse(UrlParser.webPageHTML);
		String html = "<html><head></head>"
				+ "<body>" + "<p>Parsed HTML into a doc</p>"
				+ "<p>More Parsed HTML into a doc</p>"
				+ "<p>Even more Parsed HTML into a doc</p>" + "</body></html>";
		Document doc = Jsoup.parse(html);
//		Elements paragraphs = doc.select("p");
//		System.out.println(doc.select("p").text());
		
		String htmlText = "";
		for (Element p : paragraphs) {
			htmlText = p.text();
		}
		return htmlText;
	}

	public static void main(String[] args) {
		System.out.println(ParseHtml());
	}
}