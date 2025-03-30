package Queue;

import java.util.Scanner;

class Deque<T>{
	public T[] arr;
	public int size;
	public int front,rear;
		
	Deque(int n){
		this.size=n;
		arr=(T[]) new Object[this.size];
		this.front=0;
		this.rear=0;
	}
	
	
	public void insrtLeft(T val) {
		if(front!=0) {
			front-=1;
			arr[front]=val;
		}else {
			
			if(rear<=size-1) {
				
				for(int i=rear;i>=0;i--) {
					arr[i+1]=arr[i];
				}
				arr[0]=val;
				rear+=1;
				System.out.println("Element added...");
			}
			else {
				System.out.println("Doe's not have enough space..");
			}
		}
	}
	
	public void insrtRight(T val) {
		if(rear>=size) {
			System.out.println("Overflow...");
			return;
		}
		arr[rear]=val;
		rear+=1;
		System.out.println("Element added...");
	}
	
	public T remvLeft() {
		if(front==rear) {
			System.out.println("Queue is empty...");
			front=rear=0;
			System.exit(0);
		}
		T y=arr[front];
		System.out.println("Element Dequed is: "+y);
		front+=1;
		return y;
	}
	
	public T remvRight() {
		if(front==rear) {
			System.out.println("Queue is empty...");
			front=rear=0;
			System.exit(0);
		}
		rear-=1;
		T y=arr[rear];
		System.out.println("Element Dequed is: "+y);
		
		return y;
	}
	
	
	public void display() {
		System.out.println("Elements of the Queue are:");
		for(int i=front;i<rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class DequePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue : ");
        int size=sc.nextInt();
        Deque<Integer> dq = new Deque<>(size);
        while(true){
            System.out.println("*****MENU******");
            System.out.println("1.Insert from left");
            System.out.println("2.Insert from right");
            System.out.println("3.Remove from left");
            System.out.println("4.Remove from right");
            System.out.println("5.Display");
            System.out.println("6.Exit the program");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter a number : ");
                    int num = sc.nextInt();
                    dq.insrtLeft(num);
                    break;
                case 2:
                    System.out.print("Enter a number : ");
                    int n = sc.nextInt();
                    dq.insrtRight(n);
                    break;
                case 3:
                    Integer v=dq.remvLeft();
                    System.out.println("Item removed : "+v);
                    break;
                case 4:
                    Integer w=dq.remvRight();
                    System.out.println("Item removed : "+w);
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("invalid choice ");
            }
        }
	}

}
