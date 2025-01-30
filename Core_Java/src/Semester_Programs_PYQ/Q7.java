package Semester_Programs_PYQ;

interface Prime{
	public boolean isPrime(int n);
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p = (n)->{
			
			for(int i=2;i<n;i++) {
				
				if(n%i==0) return false;
			}
			
			return true;
		};
		
		System.out.println(p.isPrime(7)); //true
		System.out.println(p.isPrime(10)); //false
	}

}
