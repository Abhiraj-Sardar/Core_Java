package Stack;

public class Stack<T> {
	
	private int top=-1;
	private T[] arr;
	private int size;
	
	Stack(int size){
		this.size=size;
		arr=(T[]) new Object[size];
	}
	
	public boolean isOverFlow() {
		
		if(top==size-1) return true;
		return false;
	}
	
	public boolean isUnderFlow() {
		if(top==-1) return true;
		return false;
	}
	
	public void push(T val) {
		try {
			if(isOverFlow()) {
				throw new ArrayIndexOutOfBoundsException();
			}else {
				top++;
				arr[top]=val;
			}
		}catch(Exception e) {
			System.out.println("OverFlow...Stack is Full...!!!");
			System.exit(0);
		}
		
	}
	
	public T pop() {
		T y=null;
		try {
			if(isUnderFlow()) {
				throw new ArrayIndexOutOfBoundsException();
			}else {
				y=arr[top];
				top--;
//				System.out.println("Popped Item is : "+y);
			}
		}catch(Exception e) {
			System.out.println("UnderFlow...Stack is Empty...!!!");
			System.exit(0);
		}
		
		return y;
	}
	
	public T peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top==size;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}
