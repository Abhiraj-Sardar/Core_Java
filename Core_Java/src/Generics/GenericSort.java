//3. Write a Generic Method that can perform the sorting of any type of data.
package Generics;
import java.util.Arrays;

public class GenericSort {
	
	public static <T extends Comparable<T>> void sort(T arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					T temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {45,78,3,5,9,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String str[] = {"Abhiraj","Rahul","Mainak","Abdul","Bobby"};
		sort(str);
		System.out.println(Arrays.toString(str));
		
	}
}
