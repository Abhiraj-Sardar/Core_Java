package LinkedList;

class Node<T>{
	public T data;
	public Node<T> next;
	
	Node(){};
	
	Node(T data){
		this.data=data;
	}
}

class SingleLinkedList<T>{
	Node<T> head;
		
	public Node<T> create(T data){
		head=new Node<T>(data);
		System.out.println("Node created...");
		return head;
	}
	
	public void insert(Node<T> head, T data) {
		Node<T> ptr;
		ptr=head;
		
		if(head==null) {
			System.out.println("Linked List is Empty...");
			return;
		}else {
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.next = new Node<T>(data);
			System.out.println("Node Inserted...");
		}
	}
	
	public void display(Node<T> head) {
		Node<T> ptr;
		ptr=head;
		
		System.out.println("Values of linked List..");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	public void count(Node<T> ptr) {
		int cnt=0;
		while(ptr!=null) {
			ptr=ptr.next;
			cnt+=1;
		}
		
		System.out.println("Total nodes:"+cnt);
	}
	
	public Node<T> insert_at_begin(Node<T> ptr,T data) {
		Node<T> head = new Node<T>(data);
		if(ptr==null) {
			return head;
		}
		else {
			head.next=ptr;
			ptr=head;
		}
		return head;
	}
	
	public Node<T> insert_at_pos(int pos,Node<T> ptr,T data){
		int cnt=1;
		Node<T> newNode;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
			if(pos==1) {
				newNode=new Node<T>(data);
				newNode.next=ptr;
				ptr=newNode;
			}
			else {
			try {
				while(cnt!=pos-1) {
					ptr=ptr.next;
					cnt+=1;
				}
				newNode=new Node<T>(data);
				newNode.next=ptr.next;
				ptr.next=newNode;
			}catch(Exception e) {
				System.out.println("Position is invalid...");
			}
			}
		}
		return ptr;
	}
	
	public Node<T> insert_at_end(Node<T> ptr,T data) {
		Node<T> temp = new Node<T>(data);
		if(ptr==null) {
			return temp;
		}
		else {
			
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			
			ptr.next=temp;
		}
		return temp;
	}
	
	
	public void insert_after_element(Node<T> ptr,T element, T data){
		Node<T> newNode;
		int flag=0;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
								
				while(ptr!=null) {
					if(ptr.data.equals(element)) {
						newNode = new Node<T>(data);
						newNode.next=ptr.next;
						ptr.next=newNode;
						flag=1;
						break;
					}
					ptr=ptr.next;
				}
		}
		
		if(flag==1) {
			System.out.println("Element added...");
		}else {
			System.out.println("Element not exist...");
		}
	}
	
	
	public Node<T> delete_at_begin(Node<T> ptr) {
		Node<T> temp=null;
		if(ptr==null) {
			System.out.println("Nothing to delete");
		}
		else {
			temp=ptr.next;
			ptr.next=null;
		}
		return temp;
	}
	
	public Node<T> delete_at_pos(Node<T> ptr,int pos){
		int cnt=1;
		Node<T> temp=ptr;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}else {
			if(pos==1) {
				ptr=ptr.next;
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
			}catch(Exception e) {
				System.out.println("Position is invalid...");
			}
			}
		}
		return ptr;
	}
	
	public void delete_at_end(Node<T> ptr) {
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
	
	//this portion need to be done
	public Node<T> delete_specified_element(Node<T> head,T element){
		int flag=0;
		Node<T> ptr=head;
		Node<T> temp=ptr;
		if(ptr==null) {
			System.out.println("Linked List is empty...");
		}
		else if(ptr.data.equals(element)) {
			ptr=ptr.next;
			temp=null;
			return ptr;
		}
		else {	
				ptr=ptr.next;
				while(ptr.next!=null) {
					if(ptr.data.equals(element)) {
						temp.next=ptr.next.next;
						flag=1;
						break;
					}
					ptr=ptr.next;
					temp=temp.next;
				}
		}
		
		if(flag==1) {
			System.out.println("Element Deleted...");
		}else {
			System.out.println("Element not exist...");
		}
		return head;
	}
	
	public Node<T> reverse(Node<T> ptr){
		
		
		
		
		return ptr;
	}
	
	public void linearSearch(Node<T> ptr, T val) {
		int cnt=1;
		while(ptr!=null) {
			if(ptr.data.equals(val)) {
				System.out.println("Element Found at Position: "+cnt);
				return;
			}
			cnt+=1;
			ptr=ptr.next;
		}
		System.out.println("element not found...");
	}
	
}
public class LinkedListPrgm {
	public static void main(String[] args) {
		
		SingleLinkedList<Integer> sll = new SingleLinkedList<Integer>();
		Node<Integer> head = sll.create(5);
		sll.insert(head, 10);
		sll.display(head);
		sll.insert_at_pos(1, head, 12);
		sll.display(head);
		sll.count(head);
		head=sll.insert_at_begin(head, 0);
		sll.insert_at_end(head, 30);
		sll.display(head);
		sll.linearSearch(head, 10);
		sll.insert_after_element(head,0, 12);
		sll.display(head);
		head=sll.delete_at_begin(head);
//		head=sll.delete_specified_element(head, 10);
		sll.display(head);
		
	}
}
