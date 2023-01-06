package arrayDs;

import java.util.Scanner;

public class Insertion {

	public static void main(String args[]) {
		
		int n=7,pos,x;
		int arr[]=new int[n+1];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter thr array Element ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements before inserting");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		pos=3;
		x=24;
		for(int i=(n-1); i>=0; i--) {
			arr[i+1]=arr[i];
		}
		arr[pos-1]=x;
		System.out.println("After insertion of element in array");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(arr[n]);
		
		
	}
	
}
