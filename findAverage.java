
public class findAverage {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;
		int c = 9;
		int sum = (a + b + c);
		int avg = sum / 3;
		System.out.println(avg);

		String string = "madam";
		System.out.println(string.charAt(0));
		System.out.println(string.toLowerCase());
		System.out.println(string.toCharArray());
		char[] ch = string.toCharArray();
		for (char c1 : ch) {
			System.out.println(c1);

		}
		StringBuilder sb = new StringBuilder(string);
		System.out.println(sb.reverse());
		System.out.println(string.chars());

	}

}
