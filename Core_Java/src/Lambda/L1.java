package Lambda;

interface A{
	void show(); //interface with a single abstract method called Functional Interface
}

public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();//error it's an interface
		
		A a = new A(){ //annonymous class
			public void show() {
				System.out.println("Show...");
			}
		};
		
		
		a.show();
	}

}
