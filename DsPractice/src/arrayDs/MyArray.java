package arrayDs;

import java.util.Arrays;

public class MyArray {

	private Object[] myStore;
	private int actualSize=0;

	public MyArray() {
		myStore= new Object[10];
	}
	
	public Object get(int index) {
		if(index<actualSize) {
			return myStore[index];
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void add(Object obj) {
		if(myStore.length-actualSize<5) {
			 increaseSize();
		}else {
			myStore[actualSize++]=obj;
		}
	}
	
	private void increaseSize() {
		myStore=Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("new length = " + myStore.length);
	}
	
	public int size() {
		return actualSize;
	}
	
	public static void main(String args[]) {
		
		MyArray my= new MyArray();
		my.add(10);
		my.add(20);
		my.add(30);
		my.add(40);
		my.add(50);
		
		for(int i=0; i<my.size(); i++) {
			System.out.print("Element: " + my.get(i));
		}
		
	}
	
}
