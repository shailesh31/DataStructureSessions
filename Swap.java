
public class Swap {

	public static void main(String[] args) {

		int a = 23;
		int b = 20;

		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);

		System.out.println("After Swapping");

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}
