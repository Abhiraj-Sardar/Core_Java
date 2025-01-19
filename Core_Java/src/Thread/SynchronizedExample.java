package Thread;

class Table {
	synchronized static void printTable(int n) { //making this synchronized ensures that the resource (method) prinTable() 
												//should be accessed by one thread at a time. once a thread completes its 
											   //task then the resource printTable() would be avialable for the next thread in the thread Queue.
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
		
	}
}

class MyThread1 extends Thread {
	public void run() {
		Table.printTable(1);
	}
}

class MyThread2 extends Thread {
	public void run() {
		Table.printTable(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		Table.printTable(100);
	}
}

public class SynchronizedExample {
	public static void main(String t[]) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();

		t1.start();
		t2.start();
		t3.start();

	}

}

