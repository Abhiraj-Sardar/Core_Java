package LinkedList;

import java.util.Scanner;

class Node5<T>{
	public T data;
	public Node5<T> next;
	
	Node5(){};
	
	Node5(T data){
		this.data=data;
	}
}

class Deque<T>{
	Node5<T> head;
	
	public Node5<T> create(T data){
		head=new Node5<T>(data);
		System.out.println("Node created...");
		return head;
	}
	
	public Node5<T> insrtLeft(Node5<T> ptr, T val) {
		Node5<T> newNode=new Node5<T>(val);
		if(ptr==null) {
			head=newNode;
			return head;
		}
		else {
			newNode.next=ptr;
			head=newNode;
		}
		return head;
	}
	
	public Node5<T> insrtRight(Node5<T> ptr,T val) {
		Node5<T> temp = new Node5<T>(val);
		if(ptr==null) {
			head=temp;
			return head;
		}
		else {
			
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			
			ptr.next=temp;
		}
		return head;
	}
	
	public Node5<T> remvLeft(Node5<T> ptr) {
		Node5<T> temp=null;
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			temp=ptr.next;
			ptr.next=null;
			head=temp;
		}
		return head;
	}
	
	public Node5<T> remvRight(Node5<T> ptr) {
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			
			while(ptr.next.next!=null) {
				ptr=ptr.next;
			}
			
			ptr.next=null;
		}
		return head;
	}
	
	
	public void display(Node5<T> head) {
		Node5<T> ptr;
		ptr=head;
		
		System.out.println("Values of linked List..");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}


public class DequeUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node5<Integer> head=null;
		Deque<Integer> dq = new Deque<Integer>();
		Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("*****MENU******");
            System.out.println("1.Create");
            System.out.println("2.Insert from left");
            System.out.println("3.Insert from right");
            System.out.println("4.Remove from left");
            System.out.println("5.Remove from right");
            System.out.println("6.Display");
            System.out.println("7.Exit the program");
            System.out.print("Enter your choice : ");
            Integer ch = sc.nextInt();
            switch(ch){
                case 1:
                	System.out.println("Enter a Number:");
                	Integer n = sc.nextInt();
                	head=dq.create(n);
                    break;
                case 2:
                	System.out.println("Enter a Number:");
                	Integer n1 = sc.nextInt();
                	head=dq.insrtLeft(head, n1);
                    break;
                case 3:
                	System.out.println("Enter a Number:");
                	Integer n2 = sc.nextInt();
                	head=dq.insrtRight(head, n2);
                    break;
                   
                case 4:
                	head=dq.remvLeft(head);
                    break;
                case 5:
                	head=dq.remvRight(head);
                    break;
                case 6:
                	dq.display(head);
                	break;
                case 7:
                	System.exit(0);
                default:
                    System.out.println("invalid choice ");
            }
        }
	}

}
