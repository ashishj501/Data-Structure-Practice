package linkedListDS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String args[]) {
		
		PriorityQueue<Integer> pq1= new PriorityQueue<Integer>(5, Collections.reverseOrder());
		
		pq1.add(12);
		pq1.add(10);
		pq1.add(9);
		pq1.add(11);
		pq1.add(13);
		pq1.add(8);
		pq1.add(4);
		
		System.out.println("\n Original Element in PriorityQueue: " + pq1);
		
		System.out.println("\nMaximum Element in PriorityQueue: " );
		Integer val=null;
		while((val=pq1.poll()) != null) {
			System.out.print(val +" ");
		}
		System.out.println("\n");
		
	}
}
