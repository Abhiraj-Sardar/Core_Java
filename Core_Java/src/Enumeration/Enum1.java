package Enumeration;

enum Sports{
	BasketBall, FootBall, Cricket, Tennis, Badminton, Swimming, Cycling //This are public static final by default
}

public class Enum1 {

	public static void main(String[] args) {
		
		Sports sp1 = Sports.BasketBall;
		System.out.println(sp1);
		
		Sports sp2 = Sports.Cricket;
		System.out.println(sp2);
		
		Sports sp[] = Sports.values(); //returns a list of enumeration constant
		
		for(Sports s : sp) {
			System.out.println("Sports Value: "+s+" It's position: "+s.ordinal()); //it is returns position value
		}
	}

}
