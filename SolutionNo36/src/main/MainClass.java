package main;

import java.math.BigInteger;
import java.util.List;

import palindrome.PalindromeNumbers;
import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){
		
		PalindromeNumbers palindromeNumbers = new PalindromeNumbers();
		List<BigInteger> palindromeList = palindromeNumbers.find(1000000);
		
		System.out.println("The numbers which are palindrome in both decimal and binary form are " +
				palindromeList);
		System.out.println("The sum of above numbers is " + Maths.sum(palindromeList));
	}

}
