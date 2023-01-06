package linkedListDS;

import java.util.PriorityQueue;
import java.util.Queue;

public class C1 {

	public static void main(String[] args) {
		
		CustomerOrder c1=new CustomerOrder(1, "ashish", 4500.0);
		CustomerOrder c2=new CustomerOrder(3, "pradnya", 4800.0);
		CustomerOrder c3=new CustomerOrder(1, "prashant", 5000.0);
		CustomerOrder c4=new CustomerOrder(2, "sunaina", 4000.0);
		
		Queue<CustomerOrder> customerOrders= new PriorityQueue<>();
	    customerOrders.add(c1);
	    customerOrders.add(c2);
	    customerOrders.add(c3);
	    customerOrders.add(c4);
		
	    while(!customerOrders.isEmpty()) {
	    	System.out.println(customerOrders.poll());
	    }
	    
	    
	}
}
