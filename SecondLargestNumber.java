package codePractices;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void findSecondLargest(int[] arr) {

		if (arr.length == 0 || arr.length == 1) {
			System.out.println("The array does not contain enough character");
		}

		if (arr.length > 1) {
			Arrays.sort(arr);
			System.out.println(arr[arr.length - 2]);

		}

	}

	public static void main(String[] args) {

//		int[] numbers = { 1 };
		int[] numbers = { 5, 8, 2, 3, 1, 45, 23, 121, 12, 4564, -6, -234, 0, -89, -101, 222222, 5000, 9097 };
		findSecondLargest(numbers);

	}

}
