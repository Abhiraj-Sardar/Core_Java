package Queue;

import java.util.Scanner;

class CircularQueue<T>{
	
	public T arr[];
	public int front=0;
	public int rear=0;
	public int size;
	
	CircularQueue(int size){
		this.size=size;
		arr=(T[]) new Object[size];
	}
	
	public void enque(T val) {
		arr[rear]=val;
		rear=(rear+1)%this.size;
		System.out.println("Element added...");
	}
	
	public T deque() {
		if(front==rear) {
			System.out.println("Queue is empty..");
			System.exit(0);
		}
		T y=arr[front];
		System.out.println("Element Dequed is: "+y);
		front=(front+1)%this.size;
		return y;
	}
	
	public void display() {
		System.out.println("Elements of the Queue are:");
		
		if(front<rear) {
			for(int i=front;i<rear;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		else if(front==rear) {
			for(int i=0;i<rear;i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i=front;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		else {
			
			for(int i=front;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
			
			for(int i=0;i<rear;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
		System.out.println();
	}
	
}
public class CircularQueuePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue : ");
        int size=sc.nextInt();
        CircularQueue<Integer> cq = new CircularQueue<Integer>(size);
        while(true){
            System.out.println("*****MENU******");
            System.out.println("1.Insert into queue");
            System.out.println("2.Delete from the queue");
            System.out.println("3.Display items");
            System.out.println("4.Exit the program");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter a number : ");
                    int num = sc.nextInt();
                    cq.enque(num);
                    break;
                case 2:
                    int v=cq.deque();
                    System.out.println("Item removed : "+v);
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!!");
            }

        }
		
	}

}
