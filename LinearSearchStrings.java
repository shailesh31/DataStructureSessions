package codePractices;

public class LinearSearchStrings {

	public static void main(String[] args) {
		String name = "Shailesh";
		char target = 'o';

		System.out.println(linearSearch2(name, target));

	}

//	static boolean linearSearch(String str, char target) {
//		if (str.length() == 0) {
//			return false;
//		}
//		for (int i = 0; i < str.length(); i++) {
//			if (target == str.charAt(i)) {
//				return true;
//			}
//
//		}
//		return false;
//
//	}

	static boolean linearSearch2(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (char c : str.toCharArray()) {
			if (c == target) {
				return true;

			}
		}
		return false;

	}

}
