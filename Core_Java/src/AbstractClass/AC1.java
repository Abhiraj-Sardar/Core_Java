package AbstractClass;

//we can't create objects of an abstract class
abstract class A{
	
	int x; //variables are allowed
	int y;
	
	//constructors are allowed
	A(){
		x=y=-1;
	}
	
	abstract void hello();
	
	//Concrete Method is also allowed
	public void hi() {
		System.out.println("Hi...");
	}
}

class B extends A{
	
	public void hello() {
		System.out.println("Hello..");
	}
}

public class AC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
