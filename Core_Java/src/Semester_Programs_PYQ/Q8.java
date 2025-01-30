package Semester_Programs_PYQ;

import java.util.StringTokenizer;
public class Q8 {
	
	 public static String processWord(String word) {
	        StringBuilder result = new StringBuilder();
	        boolean[] seen = new boolean[256]; // ASCII character set

	        for (int i = word.length() - 1; i >= 0; i--) {
	            char ch = word.charAt(i);
	            if (Character.isLetterOrDigit(ch) && !seen[ch]) {
	                result.append(ch);
	                seen[ch] = true;
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        
	    	StringTokenizer word = new StringTokenizer("Have a nice day!");
	    	
	        while(word.hasMoreTokens()) {
	            System.out.print(processWord(word.nextToken()) + " ");
	        }
	        System.out.println();
	    }

}
