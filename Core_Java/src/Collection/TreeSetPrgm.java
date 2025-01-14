package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ll = new TreeSet<String>();
		ll.add("Abhiraj");
		ll.add("Devang");
		ll.add("Rupak");
//		ll.add(null); //error
		ll.add("Demo");
		ll.add("Abhiraj");
		
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
	}

}
}
