package codePractices;

import java.util.Arrays;

public class SecondSmallest {
	public static void findSecondSmallest(int[] arr) {
		Object secondSmallestNumber = Arrays.stream(arr).distinct().sorted().skip(1).findFirst();
		System.out.println("The second smallest number is " + secondSmallestNumber);

		if (arr.length == 0) {
			System.out.println("The array does not contain any character");

		}
		if (arr.length >= 1) {
			Arrays.sort(arr);
//			System.out.println(arr[1]);

		}

	}

	public static void main(String[] args) {

//		int[] numbers = {};
		int[] numbers = { 5, 8, 2, 3, 1, 45, 23, 121, 12, 4564, -6, -234, 0, -89, -101, -101, 222222 };
		findSecondSmallest(numbers);

	}

}
