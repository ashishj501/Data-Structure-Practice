package arrayDs;

import java.util.Scanner;

public class Deletion{
 public static void main(String[] args) 
 {
 int search_ele = 15;
 int n = 5,x;
 Scanner s = new Scanner(System.in);
 int intArr[] = new int[n];
 Scanner sc = new Scanner(System.in);
 System.out.println("\nEnter the array elements : ");
 for(int i = 0; i < n; i++)
 {
 intArr[i] = sc.nextInt();
 }
 System.out.println("\nThe Array elements are: ");
 for(int i = 0 ;i < n ; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 System.out.println("\nEnter the new element : ");
 x = sc.nextInt();
 for(int i = 0; i < 5; i++)
 {
 if(intArr[i] == search_ele)
 {
 intArr[i] = x;
 break;
 }
 }
 System.out.println("Array elements after updating: ");
 for(int i = 0; i < n ; i++)
 {
 System.out.println(intArr[i] + " " );
 }

 }
}