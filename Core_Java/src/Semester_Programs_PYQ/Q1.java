package Semester_Programs_PYQ;

//Write a method (not the entire application) called CountVowels, which takes the
//input arguments as character and checks whether it is a vowel; increment the
//instance variable called vCnt by 1.

class Vowel{
	
	int vCnt=0;
	
	public void countVowel(String str) {
		
		char arr[] = str.toCharArray();
		
		for(char s:arr) {
			
			if(s=='a'||s=='A'||s=='e'||s=='E'||s=='i'||s=='I'||s=='o'||s=='O'||s=='u'||s=='U') {
				vCnt+=1;
			}
		}
		
	}
	
	public void show() {
		System.out.print(vCnt);
	}
	
	
}

public class Q1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
