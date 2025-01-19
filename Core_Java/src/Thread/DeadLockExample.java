package Thread;

class Resource1{
	
}

class Resource2{

}

class ThreadR1 extends Thread{
	Resource1 r1;
	Resource2 r2;

	ThreadR1(Resource1 r1,Resource2 r2){
		this.r1=r1;
		this.r2=r2;
	}

	public void run(){
		synchronized(r1){
			System.out.println("Thread 1: Holding Resource 1....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1: waiting for Resource 2....");
			synchronized(r2){
				System.out.println("Thread 1 & 2: Holding Resource 2....");
			}
		}
	}
}

class ThreadR2 extends Thread{

	Resource1 r1;
	Resource2 r2;

	ThreadR2(Resource1 r1,Resource2 r2){
		this.r1=r1;
		this.r2=r2;
	}

	public void run(){
		synchronized(r2){
			System.out.println("Thread 2: Holding Resource 2....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 2: waiting for Resource 1....");
			synchronized(r1){
				System.out.println("Thread 1 & 2: Holding Resource 1....");
			}
		}
	}
}

public class DeadLockExample {

	public static void main(String[] args) {

		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();
		ThreadR1 t1 = new ThreadR1(r1,r2);
		ThreadR2 t2 = new ThreadR2(r1,r2);
		
		t1.start();
		t2.start();
	}

}
