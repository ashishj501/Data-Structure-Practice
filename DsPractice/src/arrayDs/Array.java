package arrayDs;

import java.util.Arrays;

public class Array {

	public static void main (String args[]) {
		
//		Scanner in = new Scanner(System.in);
//		int arr[]=new int [5];
//		
//		System.out.print("Enter data to store in array");
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=in.nextInt();
//		}
//		
//		System.out.println();
//		for(int i=0; i<arr.length; i++) {
//			System.out.print( arr[i]+" ");
//		}
		
		
		int arr1[]= {1,2,3,4};
		System.out.print(Arrays.toString(arr1));
		change(arr1);

		System.out.println();
		System.out.println(Arrays.toString(arr1));
		
		
	}
	
	static void change(int a[]) {
		a[3]=5;
	}
	
}
