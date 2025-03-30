package Queue;

import java.util.HashMap;

class MyException extends Exception{
	public String toString() {
		return "Queue Exception!!!";
	}
}

class Queue<T>{
	
	public T[] arr;
	private int size;
	private int front,rear;
	
	HashMap<T,Integer> hm =new HashMap<T,Integer>();
	
	
	Queue(int n){
		this.size=n;
		arr=(T[]) new Object[this.size];
		this.front=0;
		this.rear=0;
	}
	
	public boolean isOverflow() {
		
		try {
			if(rear==size) {
				throw new MyException();
			}
		}catch(MyException e) {
			System.out.println(e);
			return true;
		}
		return false;
	}
	
	public boolean isUnderflow() {
		
		try {
			if(front==rear || front==size) {
				throw new MyException();
			}
		}catch(MyException e) {
			System.out.println(e);
			return true;
		}
		return false;
		
	}
	
	public void enque(T val) {
			if(isOverflow())
			{
				return;
			}
			arr[rear]=val;
			rear+=1;
			System.out.println("Element added...");
	}
	
	public T deque() {
		if(isUnderflow())
		{
			System.exit(0);
		}
		T y=arr[front];
		System.out.println("Element Dequed is: "+y);
		front+=1;
		return y;
	}
	
	public void display() {
		System.out.println("Elements of the Queue are:");
		for(int i=front;i<rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public boolean checkSimilarity(Queue p) {
		for(int i=front;i<rear;i++) {
			if(arr[i]==p.arr[i]) {
				hm.put(arr[i], 1);
			}else {
				return false;
			}
		}
		return true;
	}
}

public class QueuePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<Integer>(5);
		q.enque(4);
		q.enque(4);
		q.enque(24);
		q.enque(15);
		q.display();
		
		Queue<Integer> p = new Queue<Integer>(5);
		p.enque(4);
		p.enque(4);
		p.enque(14);
		p.enque(15);
		p.display();
		
		if(q.checkSimilarity(p)) {
			System.out.println("Both are Similar");
		}else {
			System.out.println("Both are not Similar");
		}
		
	}

}
