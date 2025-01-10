package Lambda;

public class L3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=()->{ //run() method implementation
			System.out.println("Thread 1 is running..."); 
		};
		Thread t = new Thread(r1);
		t.start();
	}

}
