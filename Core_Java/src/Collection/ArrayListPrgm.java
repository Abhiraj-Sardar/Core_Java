package Collection;

import java.util.*;
public class ArrayListPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("Abhiraj");
		str.add("Devang");
		str.add("Rupak");
		str.add("Demo");
		
		Iterator itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
