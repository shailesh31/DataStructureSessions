package codePractices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharInString {

	public static void main(String[] args) {

		String input = "swiss";

//		for (int i = 0; i < input.length(); i++) {
//			boolean unique = true;
//			for (int j = 0; j < input.length(); j++) {
//				if (i != j && input.charAt(i) == input.charAt(j)) {
//					unique = false;
//					break;
//
//				}
//
//			}
//			if (unique) {
//				System.out.println(input.charAt(i));
//				break;
//			}
//		}

		// 2nd Approach using collection LinkedHashMap as it will maintains insertion
		// order.............

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);

		}
//		System.out.print(map);
		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}

		}

	}

}
