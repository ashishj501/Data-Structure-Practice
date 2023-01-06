package linkedListDS;

import java.util.LinkedList;
import java.util.Scanner;

public class Student {

	private static String name;
	private static String address;
	private static double GPA;
	
	static LinkedList<Student> stud= new LinkedList<Student>();
	static Scanner scanner= new Scanner(System.in);
	
	@SuppressWarnings("static-access")
	Student(String name, String address, double GPA){
		this.name=name;
		this.address=address;
		this.GPA=GPA;
	}
	
	public String getNAme() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getGpa() {
		return GPA;
	}
	
	public static void main(String args[]) {
		for(int i=0; i<2; i++) {
			System.out.println("Enter the StudentName : ");
			name=scanner.next();
			System.out.println("Enter the Address");
			address=scanner.next();
			System.out.println("Enter the GPA");
			GPA=scanner.nextDouble();
			stud.addLast(new Student(name, address, i));
		}
		System.out.println(stud);
		
		
	}

	@Override
	public String toString() {
		String str="Name: "+getNAme() +"\nAddress: "+ getAddress() + "\nGPA: " + getGpa() + "\n\n";
		return str;
	}
	
	
}
