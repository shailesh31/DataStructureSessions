package codePractices;

import java.util.HashMap;

public class FindDuplicateCharacter {

	public static void main(String[] args) {

		String str = "laptop";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		for (Character key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + ": " + map.get(key));
			}
//			System.out.println(map);

		}
	}
}
