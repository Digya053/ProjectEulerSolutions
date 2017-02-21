package calculation;

import java.util.ArrayList;
import java.util.List;

import utils.Divisors;

public class TriangleNumber {
	private int n = 99999999;
	private int i = 0;

	public int generateTriangleNo(){
		int triangleNo = 0;
		List<Integer> divisors = new ArrayList<Integer>();
		System.out.println("Triangle No     No of divisors");
		for(i = 1; i<n; i++){
			triangleNo += i;
			divisors = Divisors.findDivisors(triangleNo);
			System.out.println(triangleNo+"--------------------"+  divisors.size());
			if(divisors.size() >= 500){
				break;
			}
		}
		return triangleNo;

	}
}
