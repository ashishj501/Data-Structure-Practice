package arrayDs;

import java.util.Scanner;

public class SumOfArray1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element in array");
		int arr[] = new int [5];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array is");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	
		
		for(int i=0; i<arr.length; i++) 
		sum=sum+arr[i];	
		
		
		double average=sum/arr.length;
		
		System.out.println("Average of your array is :" + average);
		
	}
}
