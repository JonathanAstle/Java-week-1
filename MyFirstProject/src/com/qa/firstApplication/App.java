package com.qa.firstApplication;

public class App {
	public static void main(String[] args) {
		System.out.println(imAConsultant("Jon"));
	}
	
	public static String imAConsultant(String myName) {
		String sentence = "I'm a consultant called " + myName; 
		return sentence;
	}
}