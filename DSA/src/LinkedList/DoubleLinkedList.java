package LinkedList;


import java.util.Scanner;

class Node3<T>{
	public T data;
	public Node3<T> next;
	public Node3<T> prev;
	
	Node3(){};
	
	Node3(T data){
		this.data=data;
	}
}


class DLL<T>{
	Node3<T> head;
	
	public Node3<T> create(T data){
		head=new Node3<T>(data);
		System.out.println("Node created...");
		return head;
	}
	
	public Node3<T> insert_at_pos(int pos,Node3<T> ptr,T data){
		int cnt=1;
		Node3<T> newNode;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
			if(pos==1) {
				newNode=new Node3<T>(data);
				newNode.next=ptr;
				ptr.prev=newNode;
				ptr.next=null;
				newNode.prev=null;
				return newNode;
			}
			else {
			try {
				while(cnt!=pos-1) {
					ptr=ptr.next;
					cnt+=1;
				}
				newNode=new Node3<T>(data);
				newNode.next=ptr.next;
				ptr.next.prev=newNode;
				ptr.next=newNode;
				newNode.prev=ptr;
			}catch(Exception e) {
				System.out.println("Position is invalid...");
			}
			}
		}
		return ptr;
	}
	
	public Node3<T> insert_at_begin(Node3<T> ptr,T data) {
		Node3<T> head = new Node3<T>(data);
		if(ptr==null) {
			return head;
		}
		else {
			head.next=ptr;
			ptr.prev=head;
		}
		return head;
	}
	
	public Node3<T> insert_at_end(Node3<T> ptr,T data) {
		Node3<T> head=ptr;
		Node3<T> temp = new Node3<T>(data);
		if(ptr==null) {
			return temp;
		}
		else {
			
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			
			ptr.next=temp;
			temp.prev=ptr;
		}
		return head;
	}
	
	
	public Node3<T> delete_at_begin(Node3<T> ptr) {
		Node3<T> temp=null;
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			temp=ptr.next;
			ptr.next=null;
			temp.prev=null;
		}
		return temp;
	}
	
	public Node3<T> delete_at_pos(Node3<T> ptr,int pos){
		int cnt=1;
		Node3<T> temp=ptr;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
			if(pos==1) {
				ptr=ptr.next;
				ptr.prev=null;
				temp.next=null;
				return ptr;
			}
			else {
			try {
				while(cnt!=pos-1) {
					ptr=ptr.next;
					cnt+=1;
				}
				ptr.next=ptr.next.next;
				ptr.next.prev=ptr.next;
			}catch(Exception e) {
				System.out.println("Position is invalid...");
			}
			}
		}
		return ptr;
	}
	
	public void delete_at_end(Node3<T> ptr) {
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			
			while(ptr.next.next!=null) {
				ptr=ptr.next;
			}
			
			ptr.next=null;
		}
	}
	
	public void display(Node3<T> head) {
		Node3<T> ptr;
		ptr=head;
		
		System.out.println("Values of linked List..");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
public class DoubleLinkedList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node3<Integer> head=null;
		DLL<Integer> dll = new DLL<Integer>();
		Scanner sc =new Scanner(System.in);
		 while(true){
	            System.out.println("*****MENU******");
	            System.out.println("1.Create");
	            System.out.println("2.insert at begin");
	            System.out.println("3.insert at pos");
	            System.out.println("4.insert at end");
	            System.out.println("5.delete at begin");
	            System.out.println("6.delete at pos");
	            System.out.println("7.delete at end");
	            System.out.println("8.display");
	            System.out.println("9.exit");
	            System.out.print("Enter your choice : ");
	            int ch=sc.nextInt();
	            switch(ch){
	                case 1:
	                	System.out.println("Enter a Number:");
	                	Integer n = sc.nextInt();
	                	head=dll.create(n);
	                    break;
	                case 2:
	                	System.out.println("Enter a Number:");
	                	Integer n1 = sc.nextInt();
	                	head=dll.insert_at_begin(head, n1);
	                    break;
	                case 3:
	                	System.out.println("Enter a Position:");
	                	Integer pos = sc.nextInt();
	                	System.out.println("Enter a Number:");
	                	Integer n2 = sc.nextInt();
	                	head=dll.insert_at_pos(pos, head, n2);
	                    break;
	                    
	                case 4: 
	                	
	                	System.out.println("Enter a Number:");
	                	Integer n3 = sc.nextInt();
	                	head=dll.insert_at_end(head,n3);
	                    break;
	                    
	                case 5:
	                	head=dll.delete_at_begin(head);
	                    break;
	                    
	                case 6:
	                	System.out.println("Enter a Position:");
	                	Integer pos1 = sc.nextInt();
	                	head=dll.delete_at_pos(head, pos1);
	                    break;
	                    
	                case 7:
	                	
	                	dll.delete_at_end(head);
	                    break;
	                    
	                case 8:
	                    dll.display(head);
	                    break;
	                case 9:
	                	System.exit(0);
	                	
	                default:
	                    System.out.println("Invalid choice!!!");
	            }


	        }
	}


}
