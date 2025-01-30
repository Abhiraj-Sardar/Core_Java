package DesignPatterns;

class Car2{
	
	public String cname;
	public String color;
	public Engine engine;
	
	Car2(String cname,String color,Engine engine){
		this.cname=cname;
		this.color=color;
		this.engine=engine;
	}
	
	public void display() { 
		System.out.println("Car Details...");
		System.out.println("Brand: "+cname);
		System.out.println("color: "+cname);
		engine.display();
	}
}

class Engine{
	public String brand;
	public String mfgid;
	
	Engine(String brand,String mfgid){
		this.brand=brand;
		this.mfgid=mfgid;
	}
	
	public void display() { 
		System.out.println("Engine Details...");
		System.out.println("Engine Brand: "+brand);
		System.out.println("Engine mfgid: "+mfgid);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine e = new Engine("IDX","56784");
		Car2 c = new Car2("Ford","Yellow",e);
		c.display();
	}

}
