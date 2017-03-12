package main;

import java.util.Collections;
import java.util.List;

import file.File;
import utils.Alphabets;

public class MainClass {
	
	public static void main(String[] args){
		
	   File file = new File();
	   Alphabets alphabets = new Alphabets();
	   
	   String currentLine = file.readFile("src/resources/names.txt");
	
	   List<String> names = alphabets.addToList(currentLine);
	   Collections.sort(names);
	   
	   System.out.println("The names in sorted order are " +names);
	   System.out.println(alphabets.findScore(names));
	}

}
