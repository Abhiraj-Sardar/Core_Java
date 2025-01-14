package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ll = new LinkedHashSet<String>();
		ll.add("Abhiraj");
		ll.add("Devang");
		ll.add("Rupak");
		ll.add(null);
		ll.add("Demo");
		
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
	}

}
}