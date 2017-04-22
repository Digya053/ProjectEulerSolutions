package words;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import trianglenumbers.TriangleNumbers;

public class WordValue {

	public String[] getWords(){

		String fileName = "src/resources/p042_words.txt";
		String [] words = null;

		try {
			File f = new File(fileName);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String currentLine;

			while((currentLine = br.readLine()) != null){
				words = currentLine.replaceAll("[\"]", "").split(",");
			}
		} catch (FileNotFoundException e) {
			System.out.println("No file found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}


	public int getWordValue(String word){
		Alphabets alphabets = new Alphabets();
		word = word.toLowerCase();
		int sum = 0;
		for(int i = 0; i < word.length(); i++){
			String alphabet = String.valueOf(word.charAt(i));
			int value = alphabets.value().get(alphabet);
			sum += value;
		}
		return sum;
	}

	
	public int getCountOfTriangularWords(String[] words){
		TriangleNumbers triangleNumbers = new TriangleNumbers();
		int sum = 0;
		int count = 0;
		for(int i = 0; i < words.length; i++){
			sum = this.getWordValue(words[i]);
			if(triangleNumbers.check(sum)){
				count++;
			}
		}
		return count;
	}

}
