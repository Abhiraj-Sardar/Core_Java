package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Postfix{
	
	static Map<String,Integer> priority = new HashMap<String,Integer>();
	
public static void convert(String s) {
	
		//Priority Table
		priority.put("+",1);
		priority.put("-", 1);
		priority.put("*",2);
		priority.put("/",2);
		priority.put("^",3);
		
		s=s+" )"; //adding ( at the end // later we will add at the begining so that the expression becomes "( rest-expression )"
		
		StringTokenizer exp = new StringTokenizer(s," ");
		int n = exp.countTokens();		
		Stack<String> st = new Stack<String>(n);
		String ans = "";
		
		st.push("("); //adding ( at the beginning
		
		while(exp.hasMoreTokens()) {
			
			String ch = exp.nextToken();
			
			if(ch.equals("(") || ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*") || ch.equals("^")) {
				
				String key=st.peek();
				
				try {
					if(!key.equals("(") && (priority.get(key)>priority.get(ch))) {
						ans+=st.pop(); //pop peek element
						st.push(ch); //push current o/p
					}else {
						st.push(ch);
					}
				}catch(Exception e) {
					//catches error as key "(" doesn't have priority value
					st.push(ch);
				}
			}
			else if(ch.equals(")")) {
				while(!st.peek().equals("(")) {
					ans+=st.pop();
				}
				
				st.pop();//popping "(" o/p
			}
			else {
				
				ans+=ch;
			}
		}
		
		System.out.println(ans);
}
	public static void eval(String e) {
//		String exp="934*8+4/-";
		
		StringTokenizer exp = new StringTokenizer(e," ");
		int n = exp.countTokens();		
		Stack<Integer> st = new Stack<Integer>(n);
		
		while(exp.hasMoreTokens()) {
			
			String ch = exp.nextToken();
			
			if(ch.equals("+")) {
			
				Integer p2 = st.pop();
				Integer p1 = st.pop();
				Integer p3 = p1 + p2;
				st.push(p3);

			}else if(ch.equals("-")) {
				
				Integer p2 = st.pop();
				Integer p1 = st.pop();
				Integer p3 = p1 - p2;
				st.push(p3);
			}
			else if(ch.equals("/")) {
				
				Integer p2 = st.pop();
				Integer p1 = st.pop();
				Integer p3 = p1 / p2;
				st.push(p3);
			}
			else if(ch.equals("*")) {
				
				Integer p2 = st.pop();
				Integer p1 = st.pop();
				Integer p3 = p1 * p2;
				st.push(p3);
			}
			else {
				Integer num = Integer.parseInt(ch);
				st.push(num);
			}
		}
		
		System.out.println(st.pop());
	}
	

}

