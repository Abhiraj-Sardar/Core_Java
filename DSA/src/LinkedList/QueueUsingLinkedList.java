package LinkedList;


class Node2<T>{
	public T data;
	public Node2<T> next;
	
	Node2(){};
	
	Node2(T data){
		this.data=data;
	}
}

class Queue<T>{
	Node2<T> head=null;
	Node2<T> tail=null;
	
	public void enque(T val) {
		Node2<T> newNode=new Node2<T>(val);
		if(head==null && tail==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=tail.next;
		}
	}
	
	public void display() {
		Node2<T> ptr=head;
		System.out.println("Elements of Queue..");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	public void deque() {	
		if(head==null && tail==null) {
			System.out.println("Queue is Empty...");
		}
		else {
			System.out.println("Element "+ head.data + " is Dequeued...");
			head=head.next;
		}
		
	}

}
public class QueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<Integer>();
		q.enque(12);
		q.enque(9);
		q.enque(90);
		q.display();
		q.deque();
		q.display();
	}

}
