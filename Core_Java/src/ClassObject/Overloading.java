package ClassObject;

class Area_cal
{
    double area(int l,int b)
    {
        return l*b;
    }
    double area(int r)
    {
        return 3.14*r*r;
    }
}

public class Overloading
{
	public static void main(String[] args) {
	    Area_cal rect = new Area_cal();
	    System.out.println("Area of rectangle : "+rect.area(2,3)); 
	    
	    Area_cal cir = new Area_cal();
	    System.out.println("Area of Circle : "+ cir.area(7)); 
	}
}