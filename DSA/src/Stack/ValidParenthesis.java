package Stack;

public class ValidParenthesis {
	public static boolean checkValidParenthesis(String str,Stack st) {
//		str="({}[])";
		char []s=str.toCharArray();
		try {
		for(int i=0;i<s.length;i++) {
			
			if(s[i]=='(' || s[i]== '{' || s[i]=='[') {
//				System.out.println(s[i]);
				st.push(s[i]);
			}
			else if((s[i]==')' && st.peek().equals('(')) || (s[i]=='}' && st.peek().equals('{')) || (s[i]==']' && st.peek().equals('['))) {
//				System.out.println("1"+st.pop());
				st.pop();
			}
			else {
				return false;
			}
		}
		}catch(Exception e) {
			return false;
		}
		
		return st.isEmpty();
	}
}
