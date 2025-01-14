package Collection;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Abhiraj");
		ll.add("Devang");
		ll.add("Rupak");
		ll.add("Demo");
		
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
