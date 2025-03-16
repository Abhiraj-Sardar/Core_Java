package Polynomial;

class Polynomial{
	
	public int coeff[];
	
	Polynomial(int arr[]){
		this.coeff=arr;
	}
	
	public void addition(int arr1[],int arr2[]) {
		
		for(int i=coeff.length-1;i>=0;i--) {
			
		}
	}
	
	public void display() {
		
		for(int i=coeff.length-1;i>=0;i--) {
			
			if(coeff[i]==0) { //skip the 0 coefficient
				continue;
			}
			
			if(i==0) {
				System.out.print(coeff[i]); //print only coefficient i case of only x^0
			}
			else {
				System.out.print(coeff[i]+"x^"+i+"+");
			}
		}
		
	}
	
}

public class PolynomialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1[]={1,0,2,3};
		Polynomial p = new Polynomial(p1);
		p.display();
	}

}
