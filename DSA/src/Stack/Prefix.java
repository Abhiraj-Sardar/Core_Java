package Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//infix to prefix conversion is done by the steps
//Step 1: Reverse the infix string, while reversing you must interchange left and right parentheses.
//Step 2: Obtain the postfix expression of the infix expression.
//Step 3: Reverse the postfix expression to get prefix expression.

public class Prefix {
	
	static Map<String,Integer> priority = new HashMap<String,Integer>();
	
	public static String reverse(String s) {
		String rs="";
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==')') {
				rs=rs+"(";
			}
			else if(s.charAt(i)=='(') {
				rs=rs+")";
			}
			else {
				rs=rs+s.charAt(i);
			}
		}
		return rs;
	}
	public static void convert(String s) {
		
		//Priority Table
		priority.put("+",1);
		priority.put("-", 1);
		priority.put("*",2);
		priority.put("/",2);
		priority.put("^",3);
		
		//reversing the string
		s=reverse(s)+" )"; //adding ) at the end // later we will add "(" at the begining so that the expression becomes "( rest-expression )"
		
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
		
		System.out.println("Postfix Conversion is: "+reverse(ans));
}
	
	public static void eval(String e) {
		
		StringTokenizer exp = new StringTokenizer(e," ");
		int n = exp.countTokens();		
		Stack<String> st = new Stack<String>(n);
		int cnt=0;
		while(exp.hasMoreTokens()){
			
			String ch = exp.nextToken();
			
			if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
				st.push(ch);
				cnt=0;
			}
			else {
				if(cnt!=1) {
					st.push(ch);
					cnt+=1;
				}else{
					
					Integer p1 = Integer.parseInt(st.pop());
					Integer p2 = Integer.parseInt(ch);
					String op = st.pop();
					if(op.equals("+")) {
						Integer p3=p1+p2;
						st.push(p3.toString());
					}
					else if(op.equals("-")) {
						Integer p3=p1-p2;
						st.push(p3.toString());
					}
					else if(op.equals("*")) {
						Integer p3=p1*p2;
						st.push(p3.toString());
					}
					else{
						Integer p3=p1/p2;
						st.push(p3.toString());
					}
					cnt=1;
				}
				
			}			
		}
		
		while(st.getTopPos()!=0) {
			
			Integer p1 = Integer.parseInt(st.pop());
			Integer p2 = Integer.parseInt(st.pop());
			try {
				String op = st.pop();
				if(op.equals("+")) {
					Integer p3=p2+p1;
					st.push(p3.toString());
				}
				else if(op.equals("-")) {
					Integer p3=p2-p1;
					st.push(p3.toString());
				}
				else if(op.equals("*")) {
					Integer p3=p2*p1;
					st.push(p3.toString());
				}
				else{
					Integer p3=p2/p1;
					st.push(p3.toString());
				}
			}catch(Exception e1) {
				System.out.println("The operator is a number...");
			}
		} 
		
		System.out.println("Prefix Evaluation is: "+st.pop());
		
	}
}
