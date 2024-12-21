package Enumeration;

//As explained, a Java enumeration is a class type. Although you don’t instantiate an enum
//using new, it otherwise has much the same capabilities as other classes. The fact that enum
//defines a class gives the Java enumeration extraordinary power. For example, you can give 
//them constructors, add instance variables and methods, and even implement interfaces.
//It is important to understand that each enumeration constant is an object of its 
//enumeration type. Thus, when you define a constructor for an enum, the constructor is 
//called when each enumeration constant is created. Also, each enumeration constant has its 
//own copy of any instance variables defined by the enumeration. For example, consider the 
//following version of Apple

enum Fruits{
	Mango(100), Apple(25), Grape(30), Pineapple(50); //all the enumeration constants are objects also by default
	
	int price;
	
	Fruits(int p){
		price=p;
	}
	
	int getPrice() {
		return price;
	}
}

public class Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruits fl[] = Fruits.values();
		for(Fruits f:fl) {
			System.out.println("Fruit: "+f+" Price: "+f.getPrice());
		}
	}

}
