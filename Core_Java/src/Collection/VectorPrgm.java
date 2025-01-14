package Collection;

import java.util.Vector;
import java.util.Iterator;
public class VectorPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Abhiraj");
		v.add("Devang");
		v.add("Rupak");
		v.add("Demo");
		
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
