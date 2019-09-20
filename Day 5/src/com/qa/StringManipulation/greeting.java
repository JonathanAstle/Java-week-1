package com.qa.StringManipulation;

public class greeting {

	public static void main(String[] args) {
		String greeting = "Hi there";
		
		System.out.println(greeting.substring(0,1)); //starting at the 0th index, take letters up to but NOT including index 1
		
		
		
		
		System.out.println("Now looping through the string...");
		
		for (int i=0; i<greeting.length(); i++) {
			System.out.println(greeting.substring(i,i+1));
		}
		
		
		System.out.println("Now applying iIntoO method...");
		//applying iIntoO method
		System.out.println(ReplaceLetters(greeting, "e", "w"));
		
		
	}
	
	
	//Method that turns all 'i's into 'o's

	public static String ReplaceLetters(String sentence, String before, String after) {
		String returnSentence = "";
		for (int i = 0; i<sentence.length(); i++) {
			if (sentence.substring(i, i+1).equals(before)) {
				returnSentence += after;
			} else {
				returnSentence += sentence.substring(i,i+1);
			}
		}
		return returnSentence;
	}

}
