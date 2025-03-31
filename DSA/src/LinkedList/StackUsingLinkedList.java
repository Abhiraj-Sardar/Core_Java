package LinkedList;

class Node1<T>{
	public T data;
	public Node1<T> next;
	
	Node1(){};
	
	Node1(T data){
		this.data=data;
	}
}

class Stack<T>{
	Node1<T> head=null;
	
	public void push(T val) {
		Node1<T> newNode=new Node1<T>(val);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		System.out.println("Element is Pushed...");
	}
	
	public void display() {
		Node1<T> ptr=head;
		System.out.println("Elements of Stack..");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	public void pop() {	
		if(head==null) {
			System.out.println("Stack is Empty...");
		}
		else {
			System.out.println("Element "+ head.data + " is Popped...");
			head=head.next;
		}
		
	}

}
public class StackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(12);
		s.push(19);
		s.display();
		s.pop();
		s.display();
	}

}
