package test.com;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		System.out.println(validatePassword("qwertyuioplkjhgfdsazxcvbnmq1Er@y$"));
	}

	static int validatePassword(String password) {
		Pattern low = Pattern.compile(".*[a-z]{1,}.*");
		Boolean lowerCaseMatch = low.matcher(password).matches();

		Pattern up = Pattern.compile(".*[A-Z]{1,}.*");
		Boolean upperCaseMatch = up.matcher(password).matches();

		Pattern num = Pattern.compile(".*[0-9]{1,}.*");
		Boolean numericMatch = num.matcher(password).matches();

		Pattern patteren1 = Pattern.compile(".*[@#$&_]{1,}.*");
		Boolean special = patteren1.matcher(password).matches();
		if (password.length() < 8 || password.length() > 31) {
			return 10;
		} else if (!(lowerCaseMatch && upperCaseMatch && numericMatch)) {
			return 20;
		} else if (!special) {
			return 30;
		} else if (repeatedChars(password)) {
			return 40;
		} else {
			return 0;
		}

	}

	private static boolean repeatedChars(String password) {
		Map<Character, Integer> map = new HashMap<>();
		boolean isRepeatedChar = false;
		for (int i = 0; i < password.length(); i++) {
			if (map.containsKey(password.charAt(i))) {
				map.put(password.charAt(i), map.get(password.charAt(i)) + 1);
				return true;
			} else {
				map.put(password.charAt(i), 1);
			}
		}
		return isRepeatedChar;
	}

}
