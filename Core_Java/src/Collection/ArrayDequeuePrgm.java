package Collection;

import java.util.ArrayDeque;

public class ArrayDequeuePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Abhiraj");
		ad.add("Rahul");
		ad.add("Devang");
		
		for(String str : ad) {
			System.out.println(str);
		}
		
	}

}
