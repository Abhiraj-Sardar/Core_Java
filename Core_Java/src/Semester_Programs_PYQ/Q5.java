package Semester_Programs_PYQ;

//Write a program that outputs the name of the capital of the country entered at the
//command line. The program should throw a “NoMatchFoundException” when it fails
//to print the capital of the country entered at the command line.

import java.util.Scanner;
class NoMatchFoundException extends Exception{
	
	public String toString() {
		return "NoMatchFoundException";
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country[]= {"India","Bangladesh","Pakistan","China"};
		String capital[]= {"New Delhi","Dhaka","Islamabad","Beijing"};
		
		System.out.println("Enter a Country:");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		
		int flag=0;
		int loc=0;
		
		for(int i=0;i<4;i++) {
			if(country[i].equalsIgnoreCase(name)) {
				flag=1;
				loc=i;
				break;
			}
		}
		
		try {
			if(flag==1) {
				System.out.println("Capital: "+capital[loc]);
			}
			else {
				throw new NoMatchFoundException();
			}
		}catch(NoMatchFoundException e) {
			System.out.println(e);
		}

	}

}
