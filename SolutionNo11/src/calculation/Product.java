package calculation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import utils.Maths;

public class Product {
	private List<Integer> mulUpNo;
	private List<Integer> mulDownNo;
	private List<Integer> mulRightNo;
	private List<Integer> mulLeftNo;
	private List<Integer> mulLeftDiagonal;
	private List<Integer> mulRightDiagonal;
	private LinkedList<Integer> integrate;

	public Product(){
		mulUpNo = new ArrayList<Integer>();
		mulDownNo = new ArrayList<Integer>();
		mulRightNo = new ArrayList<Integer>();
		mulLeftNo = new ArrayList<Integer>();
		mulLeftDiagonal = new ArrayList<Integer>();
		mulRightDiagonal = new ArrayList<Integer>();
		integrate = new LinkedList<Integer>();
	}

	public void up(){
		List<Integer> upNo = new ArrayList<Integer>();
		for(int j = 0; j<20; j++){
			for(int i = 19; i>=0; i--){
				upNo.add(Matrix.nums[i][j]);
				if(upNo.size()== 20){
					System.out.println("The numbers in upward direction are: "+upNo);
					for(int k=0; k < upNo.size()-3; k++){
						Integer mul = upNo.get(k)* upNo.get(k+1) * upNo.get(k+2) * upNo.get(k+3);
						mulUpNo.add(mul);
					}

				}	
			}
			System.out.println("The product of numbers in upward direction of single column are: "+
					mulUpNo);
			integrate.add(Maths.max(mulUpNo));
			System.out.println();
			upNo.clear();
			mulUpNo.clear();
		}
	}

	public void down(){
		List<Integer> downNo = new ArrayList<Integer>();
		for(int j = 0; j<20; j++){
			for(int i = 0; i<20; i++){
				downNo.add(Matrix.nums[i][j]);
				if(downNo.size()== 20){
					System.out.println("The numbers in downward direction are: "+downNo);
					for(int k=0; k < downNo.size()-3; k++){
						Integer mul = downNo.get(k) * downNo.get(k+1) * downNo.get(k+2) * downNo.get(k+3);
						mulDownNo.add(mul);
					}

				}	
			}
			System.out.println("The product of numbers in downward direction of single column are: "+
					mulDownNo);
			integrate.add(Maths.max(mulDownNo));
			System.out.println();
			downNo.clear(); 
			mulDownNo.clear();
		}
	}

	public void right(){
		List<Integer> rightNo = new ArrayList<Integer>();
		for(int i = 0; i<20; i++){
			for(int j = 0; j<20; j++){
				rightNo.add(Matrix.nums[i][j]);
				if(rightNo.size()== 20){
					System.out.println("The numbers towards right are: "+rightNo);
					for(int k=0; k < rightNo.size()-3; k++){
						Integer mul = rightNo.get(k) * rightNo.get(k+1) * rightNo.get(k+2) * rightNo.get(k+3);
						mulRightNo.add(mul);
					}

				}	
			}
			System.out.println("The product of numbers towards right are: "+
					mulRightNo);
			integrate.add(Maths.max(mulRightNo));
			System.out.println();
			rightNo.clear(); 
			mulRightNo.clear();
		}
	}

	public void left(){
		List<Integer> leftNo = new ArrayList<Integer>();
		for(int i = 0; i<20; i++){
			for(int j = 19; j>=0; j--){
				leftNo.add(Matrix.nums[i][j]);
				if(leftNo.size()== 20){
					System.out.println("The numbers towards left are: "+leftNo);
					for(int k=0; k < leftNo.size()-3; k++){
						Integer mul = leftNo.get(k) * leftNo.get(k+1) * leftNo.get(k+2) * leftNo.get(k+3);
						mulLeftNo.add(mul);
					}

				}	
			}
			System.out.println("The product of numbers towards left are: "+
					mulLeftNo);
			integrate.add(Maths.max(mulLeftNo));
			System.out.println();
			leftNo.clear(); 
			mulLeftNo.clear();
		}
	}

	public void leftDiagonal(){
		List<Integer> leftDiagonal = new ArrayList<Integer>();
		int j =0;
		int size = 20;
		int count = 1;
		boolean flag = true;
		while(flag){
			for(int i = 0; i < size ; i++){
				leftDiagonal.add(Matrix.nums[i][j]);
				j++;
			}
			j = count;
			size = size -1;
			count++;
			if(size == 3){
				flag = false;
			}
			System.out.println("The numbers in the left diagonal are: " +leftDiagonal);
			for(int k = 0; k < leftDiagonal.size()-3; k++){
				Integer mul = leftDiagonal.get(k) * leftDiagonal.get(k+1) * leftDiagonal.get(k+2) * leftDiagonal.get(k+3);
				mulLeftDiagonal.add(mul);
			}
			System.out.println("The multiplication of numbers towards left diagonal are: "+ mulLeftDiagonal);
			System.out.println();
			integrate.add(Maths.max(mulLeftDiagonal));
			leftDiagonal.clear();
			mulLeftDiagonal.clear();

		}
	}

	public void rightDiagonal(){
		List<Integer> rightDiagonal = new ArrayList<Integer>();
		int i = 0;
		int size = 19;
		boolean flag =  true;
		while(flag){
			for(int j = size; j >= 0 ; j--){
				rightDiagonal.add(Matrix.nums[i][j]);
				i++;
			}
			i = 0;
			size = size -1;
			if(size == 2){
				flag = false;
			}
			System.out.println("The numbers in the right diagonal are: " +rightDiagonal);
			for(int k = 0; k < rightDiagonal.size()-3; k++){
				Integer mul = rightDiagonal.get(k) * rightDiagonal.get(k+1) * rightDiagonal.get(k+2) * rightDiagonal.get(k+3);
				mulRightDiagonal.add(mul);
			}
			System.out.println("The multiplication of numbers towards right diagonal are: "+ mulRightDiagonal);
			System.out.println();
			integrate.add(Maths.max(mulRightDiagonal));
			rightDiagonal.clear();
			mulRightDiagonal.clear();

		}
	}

	public void greatest(){
		System.out.println("The greatest product in the grid is "+Maths.max(integrate));
	}
}



