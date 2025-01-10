package Lambda;

interface Greet{
	String hello();
}

interface B{
	void val(int x);
}

interface Add{
	int add(int x,int y);
}

public class L2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet g = ()->{ //non-parameterzied lambda
			return "Hello There...";
		};
		
		System.out.println(g.hello());
		
		B b = (x)->{ //parameterized lambda
			System.out.println("The value is: "+x);
		};
		
		b.val(10);
		
		Add a = (x,y)->x+y; //another use of lambda
		System.out.println("Add :"+ a.add(10, 20));
	}

}
