package codePractices;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String string = "OPENTEXT";
		char charToReplace = 'E';

		// O/p:- OPEN1EX2
		// check char present in string
		if (string.indexOf(charToReplace) == -1) {
			System.out.println("Given character is not available in the string..");
			System.exit(0);
		}
		// logic to replace char occurence in String
//
//		char[] arr = string.toCharArray();
//		int count = 1;
//		for (int i = 0; i < string.length(); i++) {
//			if (arr[i] == charToReplace) {
//				arr[i] = String.valueOf(count).charAt(0);
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		int count = 1;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == charToReplace) {
				string = string.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(string);
	}

}
