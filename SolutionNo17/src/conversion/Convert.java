package conversion;

public class Convert {

	public static String[] numsName = {"","one","two","three","four","five","six","seven","eight","nine","ten",
			"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};

	public static String[] tensName = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

	public static String intoWord(int number){
		String words;
		if(number == 1000){
			return "one thousand";
		}
		if(number%100 < 20){
			words = numsName[number%100];
			number /= 100;
		}
		else{
			words = numsName[number%10];
			number /=10;

			words = tensName[number%10]+ words;
			number /=10;
		}
		if(number == 0){
			return words;
		}
		if(words == ""){
			words = numsName[number]+" hundred "+words;
		} else{
			words = numsName[number]+" hundred and "+words;
		}
		return words;
	}
}
