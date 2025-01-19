package Thread;

class CT1 implements Runnable{
	
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class T2 {

	public static void main(String[] args) {
		
		CT1 r = new CT1();
		Thread t1 = new Thread(r);
		t1.setName("Abhiraj");
		
		t1.start();
		
		System.out.println(t1.getName());
		
	}

}
