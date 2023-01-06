package stackDS;

public class MyStack {

	private int arr[];
	private int top;
	private int capacity;
	
	
	public MyStack(int size){
	arr=new int[size];
    capacity=size;
    top=-1;
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
	
	//Inserting an element in stack
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("OverFlow\nProgram is terminated " );
			System.exit(-1);
		}
		System.out.println("Inserting " + x);
		arr[++top]=x;
	}
	
    public boolean isEmpty() {
		return top ==-1;
	}
	
	//removing element from stack
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Underflow\nProgram is terminated ");
		}
		System.out.println("Removing " + peek());
		return arr[top--];
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.exit(-1);
		}
		return -1;
	}
	
	public int size() {
		return top+1;
	}



	
}
