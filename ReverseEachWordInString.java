package codePractices;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "avaJ gnimmargorP si yrev ysae ";
		System.out.println("Original string is ::" + str);
		String[] words = str.split(" ");
		String output = "";

		for (String word : words) {
			String reversedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				reversedWord = reversedWord + word.charAt(i);
			}
			output = output + reversedWord + " ";
		}
		System.out.println("Reversed string is ::" + output);

	}

}
