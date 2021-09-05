package com.src;

import java.util.regex.Pattern;

public class ReverseSentence {
	String reverse(String str) {
		Pattern pattern = Pattern.compile("\\s");
		String str1[] = pattern.split(str);
		String result = "";
		for (int i = 0; i < str1.length; i++) {
			if (i == str1.length - 1) {
				result = str1[i] + result;

			}

			else
				result = " " + str1[i] + result;

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to java learning session";
		ReverseSentence rs = new ReverseSentence();
		System.out.println(rs.reverse(str));

	}

}
