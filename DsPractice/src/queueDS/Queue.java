package queueDS;

public class Queue {
int size=5;
int items[]=new int [size];
int front,rear;

public Queue(){
	front=-1;
	rear=-1;
}

public boolean isFull() {
	if(front==0 && rear==size-1) {
		return true;
	}return false;
}

public boolean isEmpty() {
	if(front==-1)
		return true;
	else
		return false;
}


public void enQueue(int element) {
	if(isFull()) {
		System.out.print("Queue is full. ");
	}else {
		if(front==-1) {
			front=0;
		}
		rear++;
		items[rear]=element;
		System.out.println("insert " + element );
	}
}

int deQueue() {
	int element;
	if(isEmpty()) {
		System.out.println("Queue is Empty");
		return -1;
	}else {
		element=items[front];
		
		if(front>=rear) {
			front=-1;
			rear=-1;
		}else{
			front++;
		}
		System.out.print(element + " Deleted ");
		return element;
	}
}

public void display() {
	int i;
	if(isEmpty()) {
		System.out.println("Empty Queue");
	}else {
		System.out.println("\nFront Index " + front);
		System.out.print("Items->");
		for(i=front; i<=rear; i++) {
			System.out.println(items[i]+" ");
			
		System.out.println("\nRear Index " + rear );	
		}
	}
}

public static void main(String args[]) {
	
	Queue q= new Queue();
	
	for(int i=0; i<6; i++) {
		q.enQueue(i);
	}
	
	q.enQueue(6);
	
	q.display();
	
	q.deQueue();
	
	q.display();
	
}


}
