package Collection;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueuePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Abhiraj");
		pq.add("Rahul");
		pq.add("Devang");
		
		System.out.println("Head: "+pq.peek());
		System.out.println(pq.remove());
		System.out.println("Head: "+pq.peek());
		
		Iterator itr = pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
