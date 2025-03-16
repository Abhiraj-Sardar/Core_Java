package Sorting;

import java.util.Arrays;

class BubbleSort<T>{
	
	public static <T extends Comparable<T>> T[] sort(T arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
}

public class BubbleSortPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr1[]={23,12,45,34,65,47};
		Integer sortedArr1[] = BubbleSort.sort(arr1);
		
		String arr2[]= {"Abhiraj","Raj","Kevin","Jaddu","Rakesh"};
		String sortedArr2[] = BubbleSort.sort(arr2);
		
		System.out.println("Sorted Array:"+Arrays.toString(sortedArr1));
		System.out.println("Sorted Array:"+Arrays.toString(sortedArr2));
	}

}
