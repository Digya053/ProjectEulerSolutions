package utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alphabets {
	private Map<String, Integer> alphabets;

	public Map<String, Integer> getPosition(){
		alphabets = new HashMap<String, Integer>();
		alphabets.put("a", 1);
		alphabets.put("b", 2);
		alphabets.put("c", 3);
		alphabets.put("d", 4);
		alphabets.put("e", 5);
		alphabets.put("f", 6);
		alphabets.put("g", 7);
		alphabets.put("h", 8);
		alphabets.put("i", 9);
		alphabets.put("j", 10);
		alphabets.put("k", 11);
		alphabets.put("l", 12);
		alphabets.put("m", 13);
		alphabets.put("n", 14);
		alphabets.put("o", 15);
		alphabets.put("p", 16);
		alphabets.put("q", 17);
		alphabets.put("r", 18);
		alphabets.put("s", 19);
		alphabets.put("t", 20);
		alphabets.put("u", 21);
		alphabets.put("v", 22);
		alphabets.put("w", 23);
		alphabets.put("x", 24);
		alphabets.put("y", 25);
		alphabets.put("z", 26);

		return alphabets;
	}

	public List<String> addToList(String name){
		List<String> names = new ArrayList<String>();
		name = name.replaceAll(",", " ").replaceAll("\"", "").toLowerCase();
		String [] splitted = name.split("\\s+");
		for(String split : splitted){
			names.add(split);
		}
		return names;
	}

	public int findPosition(List<String> names, String name){
		name = name.toLowerCase();
		int position = 0;
		for(int i = 0; i<names.size(); i++){
			if(names.get(i).equals(name)){
				position = i+1;
			}
		}
		return position;
	}

	public int findWorthOfName(String name){
		name = name.toLowerCase();
		int worth = 0;
		for(int i = 0; i<name.length();i++){
			String character= String.valueOf(name.charAt(i));
			worth += this.getPosition().get(character);
		}
		return worth;
	}

	public BigInteger findTotalWorthOfNames(List<String> names){
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i<names.size(); i++){
			sum = sum.add(BigInteger.valueOf(this.findWorthOfName(names.get(i))));
		}
		return sum;

	}
	public BigInteger findScore(List<String> names){
		BigInteger score = BigInteger.ZERO;
		for(int i = 0; i<names.size(); i++){
			int worth = this.findWorthOfName(names.get(i));
			int position = this.findPosition(names, names.get(i));
			score = score.add(BigInteger.valueOf(worth * position));
		}
		return score;
	}
}
