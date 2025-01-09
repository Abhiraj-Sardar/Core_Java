package Generics;

class G{
	public <T> void method(T x) { //generic method
		System.out.println(x);
		System.out.println("Anything...");
	}
}
public class G2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g = new G();
		g.method("Hi");
		
		Integer i = 12;
		g.method(i);
	}

}
