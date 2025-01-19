package Thread;

class Table1 {
	void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread4 extends Thread {
	Table t;

	MyThread4(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread5 extends Thread {
	Table t;

	MyThread5(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}

}

public class WithoutSynchronizationExample {

	public static void main(String[] args) {
	
		Table obj = new Table();//only one object
		MyThread4 t1=new MyThread4(obj);
		MyThread5 t2=new MyThread5(obj);
		t1.start();
		t2.start();
	}

}

//output:
//	
//	5
//	100
//	10
//	200
//	15
//	300
//	. 
//	. 
//	. 
//	. 
//	n
