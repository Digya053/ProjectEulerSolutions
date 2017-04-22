package main;

import words.WordValue;

public class MainClass {
	
	public static void main(String[] args){
		
		WordValue wordValue = new WordValue();
		
		String[] words = wordValue.getWords();
		int count = wordValue.getCountOfTriangularWords(words);
		
		System.out.println("The total no of triangular words is " + count);
		
	}

}