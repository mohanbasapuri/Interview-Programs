package test.com;

import java.util.*;

public class OccuranaceWordsEach {

	public static void main(String[] args) {
		String[] s = { "word", "era", "hawa", "word", "kaha" };
		occuranceOfWord(s);
	}

	private static void occuranceOfWord(String[] s) {
		List<String> list = Arrays.asList(s);

		Map<String, Integer> map = new HashMap<>();
		for (String s1 : list) {
			if (map.containsKey(s1)) {
				map.put(s1, map.get(s1) + 1);
			} else {
				map.put(s1, 1);
			}
		}

		map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

	}

}
