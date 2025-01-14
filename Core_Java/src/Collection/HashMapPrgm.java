package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("id", 1);
		hm.put("day", 20);
		hm.put("marks", 100);
		
		for(Entry<String, Integer> h : hm.entrySet()) {
			String key = h.getKey();
			Integer val = h.getValue();
			
			System.out.println(key+" "+val);
		}
		
		hm.remove("id");
		
		if(hm.containsKey("id")) {
			System.out.println("id available");
		}
	}

}
