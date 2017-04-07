package main;

import calculate.Coins;

public class MainClass {

	public static void main(String[] args){
		Coins coins = new Coins();
		System.out.println("The no of ways 200p can be generated is " + coins.noOfWays());
	}
}
