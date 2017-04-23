package main;

import numbers.Numbers;

public class MainClass {
	
	public static void main(String[] args){
		
		Numbers numbers = new Numbers();
		long n = 1534000000L;
		
		System.out.println("A number which is all triangular, pentagonal and hexagonal after 40755 is " 
		+ numbers.getTrianglePentagonalHexagonalNumbers(n).get(2));
	}

}
