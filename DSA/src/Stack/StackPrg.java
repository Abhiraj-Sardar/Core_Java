package Stack;

public class StackPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>(5);
		System.out.print(ValidParenthesis.checkValidParenthesis("({}[])",st));
//		System.out.print(st.isEmpty());
	}

}
