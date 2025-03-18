package codePractices;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithourrepeatCharacter {
	public static void main(String[] args) {

		String input = "hiii";
		Map<Character, Integer> map = new HashMap();
		char[] arr = input.toCharArray();
		for (char c : arr) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);

			}

		}
		System.out.println(map);

	}
}
