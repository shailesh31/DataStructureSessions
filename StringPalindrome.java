package codePractices;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Racecar";
		System.out.println(isStringPalindrome(str));

	}

	static boolean isStringPalindrome(String string) {

		if (string == null || string.length() == 0) {
			return true;

		}
		string = string.toLowerCase();
		for (int i = 0; i < string.length(); i++) {
			char start = string.charAt(i);
			char end = string.charAt(string.length() - 1 - i);

			if (start != end) {
				return false;
			}
		}
		return true;

	}

}
