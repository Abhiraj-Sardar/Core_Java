package Stack;
import java.util.HashMap;
import java.util.Map;
public class Prefix {
	static Map<String,Integer> priority = new HashMap<String,Integer>();
	
	public static void convert() {
		
		priority.put("+",1);
		priority.put("-", 1);
		priority.put("*",2);
		priority.put("/",2);
		priority.put("^",3);
		priority.put("(",0);
		
		
	}
}
