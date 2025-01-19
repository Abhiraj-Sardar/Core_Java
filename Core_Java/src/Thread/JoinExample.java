package Thread;

class CT4 extends Thread{
	
	public void run() {
		
		try {
			for(int i=0;i<3;i++) {
				Thread.sleep(1000);
				System.out.println(this.getName());
			}
		}catch(Exception e) {
			
		}
	}
}
public class JoinExample {

	public static void main(String[] args) {
		
		CT4 t1 = new CT4();
		CT4 t2 = new CT4();
		CT4 t3 = new CT4();
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.start();
		
		try {
			t1.join(); //T1 thread will tell other threads to wait until it completes it's task
		}catch(Exception e) {
			System.out.print("Error..");
		}
		
		t2.start();
		t3.start();

	}

}
