package Generics;
import java.util.ArrayList;

abstract class Shape{
	abstract void draw(); 
}

class Rectangle extends Shape{
	
	public void draw() {
		System.out.println("Rectangle");
		}
}

class Circle extends Shape{
	
	public void draw() {
		System.out.println("Circle");
		}
}
public class G3 {
	
	public static void drawing(ArrayList<? extends Shape> list) { //using of WildCard
		
		for(Shape l : list) {
			l.draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Rectangle> rec = new ArrayList<Rectangle>();
		
		rec.add(new Rectangle());
		rec.add(new Rectangle());
		
		ArrayList <Circle> cir = new ArrayList<Circle>();
		
		cir.add(new Circle());
		cir.add(new Circle());
		
		drawing(cir);
		drawing(rec);
		
		
		
	}

}
