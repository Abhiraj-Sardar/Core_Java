package Searching;

class BinarySearch<T>{
	
	public static <T extends Comparable<T>> void search(T arr[],T x) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			
			int middle = (start+end)/2;
			
			if(x.compareTo(arr[middle])==0) {
				System.out.println("Element Found at index "+middle);
				return;
			}
			else if(x.compareTo(arr[middle]) < 0){
				end=middle-1;
			}
			else {
				start=middle+1;
			}
		}
		
		System.out.println("Element Not Found");
	}
}
public class BinarySearchPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr1[]={1,2,3,4,6,7,8,9,10};
		String arr2[]= {"Abhiraj","Bablu","Calvin","Jaddu","Rakesh"};
		
		BinarySearch.search(arr1, 6);
		BinarySearch.search(arr2, "Jaddu");
	}

}
