package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Abhiraj");
		hs.add("Devang");
		hs.add("Rupak");
		hs.add(null);
		hs.add("Demo");
		hs.add("Abhiraj");
		
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
	}
 }
}
