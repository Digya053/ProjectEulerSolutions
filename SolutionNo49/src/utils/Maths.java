package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maths {
	private static List<Object> permutations = new ArrayList<>();

	public static List<Object> generatePermutationRecursively(int n, Object a[]){
		Object temp = 0;
		if(n == 1){
			permutations.add(Arrays.stream(a).collect(Collectors.toList()));
		} else {
			for(int i = 0; i < n-1; i++){
				generatePermutationRecursively(n-1,a);
				if(n % 2 == 0){
					temp = a[i];
					a[i] = a[n-1];
					a[n-1] = temp;
				} else {
					temp = a[0];
					a[0] = a[n-1];
					a[n-1] = temp;
				}
			}
			generatePermutationRecursively(n-1,a);
		}
		return permutations;
	}

	public static List<Object> generatePermutation(int n, Object[] nums){
		List<Object> permutations = new ArrayList<>();
		int c[] = new int[20];
		int i = 0;
		for (i = 0; i < n; i ++){ 
			c[i] = 0;
		}

		permutations.add(Arrays.stream(nums).collect(Collectors.toList()));
		Object temp = 0;
		i = 0;
		while (i < n){ 
			if  (c[i] < i) {
				if (i % 2 == 0){ 
					temp = nums[0];
					nums[0] = nums[i];
					nums[i] = temp;
				} else {
					temp = nums[c[i]];
					nums[c[i]] = nums[i];
					nums[i] = temp;
				}
				permutations.add(Arrays.stream(nums).collect(Collectors.toList()));
				c[i] += 1;
				i = 0;
			}
			else {
				c[i] = 0;
				i += 1;
			}
		}
		return permutations;
	}

	public static boolean isPrime(int n){
		if(n == 2){
			return true;
		} else if (n == 1 | n % 2 == 0){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeArray(Object[] nums){
		StringBuilder strNum = new StringBuilder();
		for(Object num : nums){
			strNum.append(num);
		}
		int n = Integer.parseInt(strNum.toString());
		if(n == 2){
			return true;
		} else if (n == 1 | n % 2 == 0){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(i); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static Object[] convertObjectToArray(Object object){
		String temp = String.valueOf(object);
		List<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < temp.length(); i++){
			array.add(Character.getNumericValue(temp.charAt(i)));
		} 
		return array.toArray();
	}

	public static int convertArrayToInteger(Object[] nums){
		StringBuilder strNum = new StringBuilder();
		for(Object num : nums){
			strNum.append(num);
		}
		int finalInt = Integer.parseInt(strNum.toString());
		return finalInt;
	}

	public static String concatenate(List<Integer> digits){
		StringBuilder concatenatedDigits = new StringBuilder();
		for(int i = 0; i < digits.size(); i++){
			concatenatedDigits.append(digits.get(i));
		}
		return concatenatedDigits.toString();
	}


}
