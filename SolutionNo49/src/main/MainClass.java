package main;

import java.util.List;

import sequence.Sequence;
import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){
		
		Sequence sequence = new Sequence();
		List<Integer> sequenceOfDigits = sequence.generateSequence();
		System.out.println("The number after concatenating three terms is: " + 
				Maths.concatenate(sequenceOfDigits));
		
	
	}

}
