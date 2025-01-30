package DesignPatterns;

class Car{
	
	public String cname;
	public String color;
	
	Car(String cname,String color){
		this.cname=cname;
		this.color=color;
	}
	
	public void display(Driver d) { //Association
		System.out.println("Car Details...");
		System.out.println("Brand: "+cname);
		System.out.println("color: "+cname);
		System.out.println("Driver Name: "+d.name);
		System.out.println("Driver Experience: "+d.exp);
	}
}

class Driver{
	
	public String name;
	public int exp;
	
	Driver(String name,int exp){
		this.name=name;
		this.exp=exp;
	}
}

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver d = new Driver("Rakesh",12);
		Car c = new Car("Ford","Yellow");
		c.display(d);
	}

}
