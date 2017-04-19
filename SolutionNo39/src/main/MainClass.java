package main;

import java.util.Map;

import perimeter.Perimeter;

public class MainClass {

	public static void main(String[] args){

		Perimeter perimeter = new Perimeter();
		Map<Integer, Integer> perimetersCount = perimeter.findPerimetersCount();
		
		System.out.println("The perimeter with the maximum occurence is " + 
				perimeter.getMaximumPerimeter(perimetersCount));
	}
}
