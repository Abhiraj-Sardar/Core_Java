package Thread;

class CT5 extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println(this.getName());
				Thread.yield(); //this will cause the CT5 to wait until other threads completes their task.
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}       
}

class CT6 extends Thread{
	
	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println(this.getName());
//				Thread.yield();
//				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CT5 t1 = new CT5();
		CT6 t2 = new CT6();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
	}

}

