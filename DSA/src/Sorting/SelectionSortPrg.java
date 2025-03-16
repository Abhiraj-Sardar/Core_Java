package Sorting;

import java.util.Arrays;

class SelectionSort<T>{
	
	public static <T extends Comparable<T>> T[] sort(T arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j].compareTo(arr[min])<0) {
					min=j;
				}
			}
			T temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		return arr;
	}
	
}
public class SelectionSortPrg {

	public static void main(String[] args) {
		
		Integer arr1[]={23,12,45,34,65,47};
		Integer sortedArr1[] = SelectionSort.sort(arr1);
		
		String arr2[]= {"Abhiraj","Raj","Kevin","Jaddu","Rakesh"};
		String sortedArr2[] = SelectionSort.sort(arr2);
		
		System.out.println("Sorted Array:"+Arrays.toString(sortedArr1));
		System.out.println("Sorted Array:"+Arrays.toString(sortedArr2));

	}

}
