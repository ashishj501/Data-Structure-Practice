package queueDS;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

	public static void main(String args[]) {
		
	Queue<Integer> numbers= new LinkedList<>();
	
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	
	System.out.println("Queue "+ numbers );
	
	int removedNumber=numbers.poll();
	System.out.println(removedNumber + " is removed from queue");
	
	System.out.println("Queue After deletion " + numbers);
	}
	
	
}
