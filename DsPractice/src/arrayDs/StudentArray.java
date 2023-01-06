package arrayDs;

class Student{
	
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
}


public class StudentArray {

   public static void main(String args[]) {
	   
	   
	   Student [] arr;
	   
	   arr= new Student[5];
	   
	   arr[0]= new Student(101, "ashish");
	   arr[1]= new Student(103, "tanveer");
	   arr[2]= new Student(105, "rupesh");
	   arr[3]= new Student(102, "prashant");
	   arr[4]= new Student(104, "hari");
	   
	   
	   for(int i=0; i<arr.length; i++) {
		   System.out.println("Element at " + i + " : " + arr[i].rollNo + " " + arr[i].name);
	   }
	   
	   
	   
	   
   }

	
}
