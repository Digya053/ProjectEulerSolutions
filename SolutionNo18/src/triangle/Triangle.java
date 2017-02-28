package triangle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Triangle {

	private String fileName = "resources/triangle";
	private String line = null;
	public static String lastLine;
	public static String secondLastLine;
	public static List<String> lines = new ArrayList<String>();
	
	public void construct(){
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("No file is found!");
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		try {
			while((line=bufferedReader.readLine())!=null){
				lines.add(line);
			}
			lastLine = lines.get(lines.size()-1);
			secondLastLine = lines.get(lines.size()-2);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The file is empty!");
		}
	}
}
