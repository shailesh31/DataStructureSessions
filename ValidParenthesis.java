package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&category=Strings&sortBy=submissions

//https://leetcode.com/problems/valid-parentheses/description/

public class ValidParenthesis {

	public static void main(String[] args) {
		String str = "[{()}]";
		System.out.println(isBalanced(str));

	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		for (char c : s.toCharArray()) {
			if (map.containsValue(c)) {
				stack.push(c);
			} else if (map.containsKey(c)) {
				if (stack.isEmpty() || map.get(c) != stack.pop()) {
					return false;
				}

			}
		}
		return stack.isEmpty();

	}

}
