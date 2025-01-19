package Thread;

class ChildThread extends Thread{
	
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class T1 {

	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread();
		t1.start();
		
		ChildThread t2 = new ChildThread();
		t2.start();
	
	}
}
