package codePractices;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 1, 3, 0 };
		System.out.println("The Largest element in the array is : " + sort(arr));

		int arr1[] = { 4, 7, 1, 12, 89 };
		System.out.println("The Largest element in the array1 is : " + sort(arr1));

	}

	static int sort(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length - 1];

	}
}
