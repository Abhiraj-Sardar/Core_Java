package Annotation;

//Annotation Declaration
@interface Demo{ 
	String str();
	int val();
}

class A{
	
	//Annotation Definition
	@Demo(str="Annotation Example", val=100)
	public void show() {
		System.out.println("Show Method...");
	}
}

public class AT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.show();
	}

}
