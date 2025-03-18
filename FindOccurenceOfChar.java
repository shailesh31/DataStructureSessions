package codePractices;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenceOfChar {

	public static void main(String[] args) {

		String string = "Java is object oriented langauge";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = string.toCharArray();
		int count = 1;
		for (char c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, count);

			} else {
				map.put(c, map.get(c) + 1);
			}

		}
		System.out.println(map);

//		String input = "Java is object oriented langauge";
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		char[] arr = input.toCharArray();
//		for (char c : arr) {
//			if (!map.containsKey(c)) {
//				map.put(c, 1);
//			} else {
//				map.put(c, map.get(c) + 1);
//
//			}
//
//		}
//		System.out.println(map);

//		String str = "I am learning learning java java programming";
//		// logic using hashmap collection as it will store values in key value pair.
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		int count = 1;
//		String[] arr = str.split(" ");
//		for (int i = 0; i < arr.length; i++) {
//			if (!map.containsKey(arr[i])) {
//				map.put(arr[i], count);
//			} else {
//				map.put(arr[i], map.get(arr[i]) + 1);
//			}
//		}
//
//		// Printing the output
//		for (String s : map.keySet()) {
//			System.out.println("The count of word : " + s + " =" + map.get(s));
//		}
//		
//

	}

}
