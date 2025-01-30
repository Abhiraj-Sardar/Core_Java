package Semester_Programs_PYQ;

//Write a program to create a class named Vehicle having protected instance variables
//regnNumber, speed, color, ownerName and a method showData( ) to show “This is a
//vehicle class”. Inherit the Vehicle class and create two subclasses named Bus and
//Car having individual private instance variables routeNumber in Bus and
//manufacturerName in Car and both of them having showData ( ) method showing all
//details of Bus and Car respectively with content of the super class’s showData ( )
//method.

class Vehicle {
	protected int regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	
	Vehicle(){
		regnNumber=00;
		speed=00;
		color=null;
		ownerName=null;
	}
	
	Vehicle(int rn,int sp,String col,String on) {
		regnNumber=rn;
		speed=sp;
		color=col;
		ownerName=on;
	}

	public void showData() {
		System.out.println("This is a vehicle class");
	}

}

class Bus extends Vehicle {

	private int routeNumber;
	
	Bus(){
		super();
		routeNumber=0;
	}
	
	Bus(int rn,int sp,String col,String on,int ron){
		super(rn,sp,col,on);
		routeNumber=ron;
	}
	
	public void showData() {
		System.out.println("Bus Details...");
		super.showData();
		System.out.println("regnNumber: "+regnNumber);
		System.out.println("speed: "+speed);
		System.out.println("color: "+color);
		System.out.println("ownerName: "+ownerName);
		System.out.println("routeNumber: "+routeNumber);
	}
}

class Car extends Vehicle {
	private String manufacturerName;

	Car(){
		super();
		manufacturerName=null;
	}
	
	Car(int rn,int sp,String col,String on,String mn){
		super(rn,sp,col,on);
		manufacturerName=mn;
	}
	
	public void showData() {
		System.out.println("Car Details...");
		super.showData();
		System.out.println("regnNumber: "+regnNumber);
		System.out.println("speed: "+speed);
		System.out.println("color: "+color);
		System.out.println("ownerName: "+ownerName);
		System.out.println("manufacturerName: "+manufacturerName);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus b = new Bus(12345,120,"Red","Kailash",12);
		b.showData();
		
		Car c = new Car(12345,120,"Red","Kailash","Ford");
		c.showData();
	}

}
