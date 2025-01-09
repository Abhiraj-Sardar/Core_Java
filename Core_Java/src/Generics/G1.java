package Generics;

class Game<T>{
	
	T x;
	
	public void add(T x) {
		this.x=x;
	}
	
	public T show() {
		return x;
	}
}

public class G1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game <String> s = new Game<String>();
		s.add("Hello");
		System.out.println(s.show());
		
		Game <Integer> i = new Game<Integer>();
		i.add(12);
		System.out.println(i.show());
		
		Game <Game> u = new Game<Game>();
		u.add(s);
		System.out.println(u.show());
	}

}
