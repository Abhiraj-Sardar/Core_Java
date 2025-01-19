package Thread;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

class Myt1 extends Thread {
	Customer c;

	Myt1(Customer c) {
		this.c = c;
	}

	public void run() {
		c.withdraw(15000);
	}
}

class Myt2 extends Thread {
	Customer c;

	Myt2(Customer c) {
		this.c = c;
	}

	public void run() {
		c.deposit(10000);
	}
}

public class InterThreadCommunicationExample {
	public static void main(String args[]) {
		final Customer c = new Customer();
		Myt1 t1 = new Myt1(c);
		Myt2 t2 = new Myt2(c);
		t1.start();
		t2.start();
	}
}

//going to deposit...
//deposit completed... 
//going to withdraw...
//withdraw completed...

//going to withdraw...
//Less balance; waiting for deposit...
//going to deposit...
//deposit completed... 
//withdraw completed...