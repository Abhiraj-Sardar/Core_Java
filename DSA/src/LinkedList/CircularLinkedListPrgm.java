package LinkedList;


import java.util.Scanner;

class Node4<T>{
	public T data;
	public Node4<T> next;
	public Node4<T> prev;
	
	Node4(){};
	
	Node4(T data){
		this.data=data;
	}
}


class CircularDLL<T>{
	Node4<T> head;
	Node4<T> tail;
	
	public Node4<T> create(T data){
		head=new Node4<T>(data);
		tail=head;
		tail.next=head;
		head.prev=tail;
		System.out.println("Node created...");
		return head;
	}
	
	public Node4<T> insert_at_pos(int pos,Node4<T> ptr,T data){
		int cnt=1;
		Node4<T> newNode;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
			if(pos==1) {
				newNode=new Node4<T>(data);
				newNode.next=ptr;
				ptr.prev=newNode;
				newNode.prev=tail;
				tail.next=newNode;
				head=newNode;
				return head;
			}
			else {
				try {
					while(cnt!=pos-1) {
						ptr=ptr.next;
						cnt+=1;
					}
					newNode=new Node4<T>(data);
					newNode.next=ptr.next;
					ptr.next.prev=newNode;
					ptr.next=newNode;
					newNode.prev=ptr;
				}catch(Exception e) {
					System.out.println("Position is invalid...");
				}
			}
		}
		return head;
	}
	
	public Node4<T> insert_at_begin(Node4<T> ptr,T data) {
		Node4<T> head = new Node4<T>(data);
		if(ptr==null) {
			return head;
		}
		else {
			head.next=ptr;
			ptr.prev=head;
			head.prev=tail;
			tail.next=head;
		}
		return head;
	}
	
	public Node4<T> insert_at_end(Node4<T> ptr,T data) {
		Node4<T> head=ptr;
		Node4<T> temp = new Node4<T>(data);
		if(ptr==null) {
			return temp;
		}
		else {
			
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
			tail.next=head;
			head.prev=tail;
		}
		return head;
	}
	
	
	public Node4<T> delete_at_begin(Node4<T> ptr) {
		Node4<T> temp=null;
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			temp=ptr.next;
			ptr.next=null;
			temp.prev=tail;
			tail.next=temp;
			head=temp;
		}
		return head;
	}
	
	public Node4<T> delete_at_pos(Node4<T> ptr,int pos){
		int cnt=1;
		Node4<T> temp=ptr;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
			if(pos==1) {
				ptr=ptr.next;
				ptr.prev=tail;
				tail.next=ptr;
				head=ptr;
				return head;
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
	
	public Node4<T> delete_at_end(Node4<T> ptr) {
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			
			while(ptr.next.next!=head) {
				ptr=ptr.next;
			}
			tail=ptr;
			tail.next=head;
			head.prev=tail;
		}
		return head;
	}
	
	public void display(Node4<T> head) {
		Node4<T> ptr;
		ptr=head;
		
		System.out.println("Values of linked List..");
		while(ptr.next!=head) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.print(ptr.data+" ");
		System.out.println();
	}
}
public class CircularLinkedListPrgm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node4<Integer> head = null;
		CircularDLL<Integer> dll = new CircularDLL<Integer>();
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
	                	head=dll.delete_at_end(head);
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
