package linkedListDS;

import java.util.LinkedList;

public class InsertElement {

	public static void main(String args[]) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("ashish");
		list.add("pradnya");
		list.add("rupesh");
		
		System.out.println("Element before inserting "+ list);
		list.add(1, "prashant");
		System.out.println(" ");
		System.out.println("Elements after inserting " + list);
	}
}

