package week2.day1;

import java.util.Arrays;

public class Anagram{

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		System.out.println("Length of text1:"+text1.length());
		System.out.println("Length of text2:"+text2.length());
		
		if(text1.length()==text2.length()){
		System.out.println("Both have same length");
		}
		else {
			System.out.println("Length mismatch, therefore the string are not an Anagram");	
			
			}
			char[] Array1 =text1.toCharArray();
			char[] Array2 =text2.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		
		if(Array1.equals(Array2)) {
			System.out.println("The given string are Anagram");
		}
		else {
			System.out.println("The given string are not an Anagram");
		}
	}
}	

	

