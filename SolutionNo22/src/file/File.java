package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
	
	public String readFile(String fileName){
		FileReader fr = null;
		BufferedReader br = null;
	    String currentLine = null;	
		try{
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			currentLine = br.readLine();
		} catch(IOException e){
			System.out.println("No file available!");
		}
		return currentLine;
	}
}
