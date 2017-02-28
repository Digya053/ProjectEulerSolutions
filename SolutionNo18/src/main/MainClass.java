package main;

import addition.Sum;
import triangle.Triangle;

public class MainClass {

	public static void main(String[] args){
		Triangle triangle = new Triangle();
		Sum sum = new Sum();

		triangle.construct();

		String lastLine;
		String secondLastLine;
		int size = Triangle.lines.size();
		lastLine = Triangle.lastLine;
		secondLastLine = Triangle.secondLastLine;

		for(int i = size-3; i>=0; i--){
			lastLine = sum.lastLineSum(lastLine, secondLastLine).toString();
			lastLine = lastLine.replaceAll("\\[|]|,", "");
			System.out.println("lastLine is " + lastLine);
			secondLastLine = Triangle.lines.get(i);
			System.out.println("SecondLastLine is " + secondLastLine);
		}
		System.out.println(" ");
		System.out.println(sum.lastLineSum(lastLine, secondLastLine).toString());
	}
}
