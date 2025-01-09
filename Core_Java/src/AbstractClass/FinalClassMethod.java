package AbstractClass;

class C{
	
	final public void show() { //method declared as final can't be overridden
		System.out.println("show...");
	}
}

class D extends C{
	public void show(){ //Error  //method declared as final can't be overridden
		System.out.println("show...");
	}
}

final class E{ //class declared as final cannot be extended

}

class F extends E{ //error
	
}

public class FinalClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.show();
		
		D d = new D();
		d.show();//error
	}

}
