package Collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class StringTokenizerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Text: ");
		String txt = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(txt," ");
		TreeSet<String> ts = new TreeSet<String>();
		
		while(st.hasMoreTokens()) {
			ts.add(st.nextToken());
		}
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
