package com.gc;

import java.io.*;
import java.net.*;

public class URLtoString {

	public static String outputFileName;

	public static String htmlToString(String iniUrl) throws IOException {
		outputFileName = iniUrl;

		URL target = new URL(iniUrl);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				target.openStream()));
		StringBuilder input = new StringBuilder();

		while (in.ready()) {
			input.append(in.readLine());
		}
		in.close();
		return input.toString();
	}
	public static void main(String[] args) {
		try {
			System.out.println(htmlToString("https://midcenturymodernmag.com/as-the-crow-s-feet-fly-5631656af5f9"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
