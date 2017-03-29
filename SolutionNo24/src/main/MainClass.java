package main;

import java.util.Collections;
import java.util.List;

import lexicographic.Permutations;

public class MainClass {
	
	public static void main(String[] args){
		
		String str = "0123456789";
		int n = str.length();
		
		Permutations permutation = new Permutations();
		permutation.permute(str, 0, n-1);
		
		List<String> permutationss = permutation.getPermutations();
		Collections.sort(permutationss);
		
		System.out.println("The millionth lexicographic number is " + permutationss.get(999999));

	}

}
