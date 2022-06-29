package test.com;

import java.util.Stack;

public class OccurencesBrackets {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//String val =s.nextLine();
		String val = "}Th{is} $}is{ a { {complex$} ({one})[ } ]";
		int openBrcaesCount = 0;
		int closedBracesCode = 0;
		Stack s=new Stack();
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) == '{' ) {
				openBrcaesCount++;
				s.push(val.charAt(i));
			}
		}
		for (int i = 0; i < val.length(); i++) {
			if( val.charAt(0)!='}') {
			if (val.charAt(i) == '}') {
				closedBracesCode++;
				s.push(val.charAt(i));
			}
			}
		}
		System.out.println(closedBracesCode);
		System.out.println(closedBracesCode);
		if (openBrcaesCount > closedBracesCode) {
			System.out.println(closedBracesCode);
		} else {
			System.out.println(openBrcaesCount);
		}

	}

}