package com.src;

public class StringRotation {
	boolean rotation(String s1, String s2) {
		return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABACD";
		String s2 = "CDABA";
		StringRotation sr=new StringRotation();
		if(sr.rotation(s1, s2))
		{
			System.out.println("String is rotation");
		}
		else
		{
			System.out.println("String is not in rotation");
		}

	}

}
