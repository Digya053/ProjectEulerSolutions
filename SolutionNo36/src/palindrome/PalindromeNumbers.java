package palindrome;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import utils.Maths;

public class PalindromeNumbers {

	List<BigInteger> palindromeInBaseTwoAndTen;

	public PalindromeNumbers(){
		palindromeInBaseTwoAndTen = new ArrayList<>();
	}

	public List<BigInteger> find(int n){
		for(int i = 1; i < n; i++){
			if(Maths.isPalindrome(BigInteger.valueOf(i))){
				BigInteger binaryNumber = Maths.binary(i);
				if(Maths.isPalindrome(binaryNumber)){
					palindromeInBaseTwoAndTen.add(BigInteger.valueOf(i));
				}
			}
		}
		return palindromeInBaseTwoAndTen;
	}

}
