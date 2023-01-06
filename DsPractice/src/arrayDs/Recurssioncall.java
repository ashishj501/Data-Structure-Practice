package arrayDs;

public class Recurssioncall {

	static boolean sorted(int a[], int index) {
		if(index == a.length-1) {
			return true;
		}
		return a[index]<a[index+1] && sorted(a, index+1);
	}
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,6,0};
		System.out.println(sorted(a, 0));
	}
	
}
