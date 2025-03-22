package Stack;

public class StackPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>(5);
		System.out.println(ValidParenthesis.checkValidParenthesis("({}[])",st));
		Postfix.eval("9 3 4 * 8 + 4 / -");
		Postfix.convert("9 - ( ( 3 * 4 ) + 8 ) / 4");
		Prefix.eval("- 9 / + * 3 4 8 4");
		Prefix.convert("9 - ( ( 3 * 4 ) + 8 ) / 4");
		
	}

}
