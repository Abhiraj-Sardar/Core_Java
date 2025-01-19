package Thread;

import java.io.IOException;

class CT2 extends Thread{
	
	public void run() {
		
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				System.out.println("Thread "+this.currentThread().getName()+" : "+i);
			}
		}catch(InterruptedException e) {
			
		}
	}
}

class CT3 extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				System.out.println("Thread "+this.currentThread().getName()+" : "+i);
			}
		}catch(InterruptedException e) {
			
		}
	}
}

public class T3 {

	public static void main(String[] args) {
		
		CT2 t1 = new CT2();
		CT3 t2 = new CT3();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}
}
