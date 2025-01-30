package Semester_Programs_PYQ;

//Write a generic method that can perform the sorting of any type of data.

import java.util.Arrays;

public class Q6 {
	
	public static <T extends Comparable<T>> void genericSort(T arr[]) {
			
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					
					T temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {78,0,89,12,13,7,5,100};
		genericSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		String str[] = {"Abhiraj","Rahul","Mainak","Abdul","Bobby"};
		genericSort(str);
		
		System.out.println(Arrays.toString(str));
	}
	
}
