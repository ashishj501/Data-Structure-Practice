package linkedListDS;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterator {
	
	public static void main(String args[]) {
		
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("ashish");
		list.add("shubham");
		list.add("lakhan");
		list.add("hari");
		
		System.out.println("Original Linked List: "+ list);
		
		
		Iterator it= list.descendingIterator();
		System.out.println("Linked List in reverse Order: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
