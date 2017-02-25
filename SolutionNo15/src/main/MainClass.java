package main;

import java.math.BigInteger;
import utils.Maths;

public class MainClass {

	public static void main(String[] args){
		BigInteger combination = Maths.getNoOfPaths(20, 20);
		System.out.println("The no of routes to solve 20*20 grid is " +combination);
	}
}
