package Semester_Programs_PYQ;
//
//Create a private inner class that implements a public interface. Write a method that
//returns a reference to an instance of the private inner class, up cast to the interface.
//Show that the inner class is completely hidden by trying to downcast it.

interface Demo{
	public void show();
}

class A{
	
	private class B implements Demo{
		
		public void show() {
			System.out.println("Hello from Inner class B");
		}
	}
	
	public B createInnerInstance() {
		B b = new B();
		return b;
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		Demo d = a.createInnerInstance();
		d.show();
		
//		B b = (B)d; //error
		
	}

}
