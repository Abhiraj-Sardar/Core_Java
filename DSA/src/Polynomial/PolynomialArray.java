package Polynomial;

class Polynomial{
	
	public int coeff[];
	
	Polynomial(int arr[]){
		this.coeff=arr;
	}
	
	public Polynomial substraction(Polynomial p) {
		int add[] = new int[coeff.length];
		for(int i=coeff.length-1;i>=0;i--) {
			add[i]=coeff[i]-p.coeff[i];
		}
		
		return new Polynomial(add);
	}
	
	//function for multiply
	public Polynomial multiply(Polynomial p) {
		int m=coeff.length;
		int n=p.coeff.length;
		int mul[]=new int[m+n-1];
		
		for(int i=coeff.length-1;i>=0;i--) {
			for(int j=coeff.length-1;j>=0;j--) {
				mul[i+j]= mul[i+j]+coeff[i]*p.coeff[j];
			}
		}
		
		return new Polynomial(mul);
	}
	
	public Polynomial addition(Polynomial p) {
		int add[] = new int[coeff.length];
		for(int i=coeff.length-1;i>=0;i--) {
			add[i]=coeff[i]+p.coeff[i];
		}
		
		return new Polynomial(add);
	}
	
	// function for polynomial derivation
	public Polynomial derivation(Polynomial p) {
		int dev[] = new int[coeff.length-1];
		for(int i=coeff.length-1;i>0;i--) {
			dev[i-1]=coeff[i]*i;
		}
		
		return new Polynomial(dev);
	}
	
	public void display() {
		
		for(int i=coeff.length-1;i>=0;i--) {
			
			if(coeff[i]==0) { //skip the 0 coefficient
				continue;
			}
			
			if(i==0){
				System.out.print(coeff[i]); //print only coefficient i case of only x^0
			}else if(i==1){
				System.out.print(coeff[i]+"x+");
			}
			else {
				System.out.print(coeff[i]+"x^"+i+"+");
			}
		}
		System.out.println();
		
	}
	
}

public class PolynomialArray {

	public static void main(String[] args) {
		
		int p1[]={1,3,2};
		int p2[]={1,5,3};
		Polynomial p = new Polynomial(p1); //creating Polynomial
		Polynomial q = new Polynomial(p2);
		p.display(); //displaying Polynomial
		q.display();
		Polynomial a=p.addition(q);
		a.display();
		Polynomial s=q.substraction(p);
		s.display();
		
		int a1[]= {2,5};
		int a2[]= {1,3};
		
		Polynomial A = new Polynomial(a1);
		Polynomial B = new Polynomial(a2);
		A.display();
		B.display();
		Polynomial C = A.multiply(B);
		C.display();
		
		Polynomial d = new Polynomial(p2);
		d.display();
		Polynomial dev = d.derivation(d);
		dev.display();
	}

}