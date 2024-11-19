package ClassObject;
/*Objects as Parameters*/
class Complex
{
    int real;
    int img;
    Complex(){}
    
    Complex(int r,int i){
        real=r;
        img=i;
    }
    
    void add(Complex c1,Complex c2)
    {
        real = c1.real + c2.real;
        img = c1.img + c2.img;
    }
    void dislay()
    {
       System.out.println(real+" + "+img+"i");
    }
    
}

public class ObjectParam
{
	public static void main(String[] args) {
	    Complex c1 = new Complex(2,3);  //2 + 3i
	    Complex c2 = new Complex(4,5);  //4 + 5i
	    Complex c3 = new Complex();
	    c3.add(c1,c2);
	    c3.dislay();
	}
}
