package codePractices;

public class Nto1 {

	public static void main(String[] args) {
		funBoth(5);

	}

	static void fun(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);

		fun(n - 1);

	}

	static void funReverse(int n) {
		if (n == 0) {
			return;
		}

		funReverse(n - 1);
		System.out.println(n);

	}

	static void funBoth(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		funBoth(n - 1);
		System.out.println(n);

	}

}
