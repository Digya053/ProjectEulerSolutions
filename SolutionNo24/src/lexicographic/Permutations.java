package lexicographic;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	private List<String> permutations = new ArrayList<String>();

	public List<String> getPermutations() {
		return this.permutations;
	}

	public void permute(String str, int l, int r){
		if (l == r){
			permutations.add(str);
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}


	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
