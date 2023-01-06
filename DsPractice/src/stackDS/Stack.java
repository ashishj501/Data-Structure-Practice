package stackDS;

public class Stack {


	
	public static void main(String args[]) {
		MyStack stack= new MyStack(3);
		
		stack.push(1);
		stack.push(3);
		
		stack.pop();       
	    stack.pop();        
	 
	    stack.push(2);      
	 
	    System.out.println("The top element is " + stack.peek());
	    System.out.println("The stack size is " + stack.size());
	 
	    stack.pop();        
	    
	    
	    if (stack.isEmpty()) {
	        System.out.println("The stack is empty");
	      }
	       else {
	            System.out.println("The stack is not empty");
	        }
	    }
	}
	

