package Sorting;

import java.util.Arrays;

class InsertionSort<T>{
	
	public static <T extends Comparable<T>> T[] sort(T arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			T key=arr[i];
			int j=i-1;
			while(j>=0 && (key.compareTo(arr[j])<0)){
				arr[j+1]=arr[j];
				j-=1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
}
public class InsertionSortPrg {

	public static void main(String[] args) {
		
		Integer arr1[]={23,12,45,34,65,47};
		Integer sortedArr1[] = InsertionSort.sort(arr1);
		
		String arr2[]= {"Abhiraj","Raj","Kevin","Jaddu","Rakesh"};
		String sortedArr2[] = InsertionSort.sort(arr2);
		
		System.out.println("Sorted Array:"+Arrays.toString(sortedArr1));
		System.out.println("Sorted Array:"+Arrays.toString(sortedArr2));
	
	}
}
