package test.com;

public class CountChars {
	public static void main(String[] args) {
		System.out.println(check("asdfghgfdsa"));
	}
	public static boolean check(CharSequence checkString)
	{
	  return checkString.length() != checkString.chars().distinct().count();
	}
}

