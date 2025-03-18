package codePractices;

public class FibonacciUsingTemp {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		int n = 10;

		for (int i = 1; i <= n; i++) {
			System.out.println(first + " ");
			int temp = first + second;
			first = second;
			second = temp;

		}

	}

}
