package DesignPatterns;

class SingleTon{
	
	private static SingleTon instance;
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		
		if(instance==null) {
			SingleTon instance = new SingleTon();
		}
		return instance;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		System.out.println(obj1==obj2);
	}

}
