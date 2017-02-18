package main;

import calculation.Matrix;
import calculation.Product;

public class MainClass {

	public static void main(String[] args){
		Product findProduct = new Product();
		Matrix.create();
		findProduct.up();
		findProduct.down();
		findProduct.right();
		findProduct.left();
		findProduct.leftDiagonal();
		findProduct.rightDiagonal();
		findProduct.greatest();
	}

}
