package linkedListDS;

import java.util.LinkedList;

public class JoinLinkedList {

	public static void main(String args[]) {
		
		LinkedList<String> l1= new LinkedList<>();
		l1.add("ashish");
		l1.add("jadhav");
		
		LinkedList<String> l2= new LinkedList<>();
		l2.add("Sunaina");
		l2.add("pradnya");
		
		LinkedList<String> l3= new LinkedList<>();
		l3.addAll(l1);
		l3.addAll(l2);
		
		System.out.println("Linked list after joining: " + l3);
		
	}
}
