package codePractices;

public class AnagramStrings {

	public static void main(String[] args) {

		String str1 = "psycological";
		String str2 = "calcolop SYGIoo";
//		char[] arr1 = str1.toLowerCase().toCharArray();
//		char[] arr2 = str2.toLowerCase().toCharArray();
//
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);

//		if (Arrays.equals(arr1, arr2)) {
//			System.out.println("Given Strings are anagram");
//		} else {
//			System.out.println("Given Strings are not anagram");
//		}

		// Second way

		if (areAnagrams(str1, str2)) {
			System.out.println("Given Strings are anagram");
		} else {
			System.out.println("Given Strings are not anagram");
		}

	}

	static boolean areAnagrams(String str1, String str2) {

		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Given strings are not anagram----");
		}
		// Array to store character count
		int[] charCount = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}

		for (int count : charCount) {
			if (count != 0) {

				return false;
			}
		}
		return true;

	}

}
