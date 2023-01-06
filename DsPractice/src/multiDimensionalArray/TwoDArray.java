package multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int a[][]= new int [3][3];
		
		for(int row=0; row<a.length; row++) {
	       for(int col=0; col<a[row].length; col++) {
	    	   a[row][col]=in.nextInt();
	       }
		}
		
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
	}
}
