package Searching;

class LinearSearch<T>{
	public void search(T arr[], T x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("Element Found at Position: "+i);
				return;
			}
		}
		System.out.println("Element Not Found");
	}
	
}

public class LinearSearchPrg {

	public static void main(String[] args) {
		
		Integer arr1[]={1,2,3,4,6,7,8,9,10};
		String arr2[]= {"Abhiraj","Raj","Kevin","Jaddu","Rakesh"};
		
		LinearSearch<Integer> l1 = new LinearSearch<Integer>();
		l1.search(arr1, 6);
		
		LinearSearch<String> l2 = new LinearSearch<String>();
		l2.search(arr2, "Kevin");
	}

}
