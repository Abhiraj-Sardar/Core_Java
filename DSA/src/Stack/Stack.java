package Stack;

class StackException extends Exception{
	public String toString() {
		return "Stack Class Exception";
	}
}
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
				throw new StackException();
			}else {
				top++;
				arr[top]=val;
			}
		}catch(StackException e) {
			System.out.println("OverFlow...Stack is Full...!!!");
			System.exit(0);
		}	
	}
	
	public T pop() {
		T y=null;
		try {
			if(isUnderFlow()) {
				throw new StackException();
			}else {
				y=arr[top];
				top--;
//				System.out.println("Popped Item is : "+y);
			}
		}catch(StackException e) {
			System.out.println("UnderFlow...Stack is Empty...!!!");
			System.exit(0);
		}
		
		return y;
	}
	
	public int getTopPos() {
		return top;
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
