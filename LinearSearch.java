package codePractices;

public class LinearSearch {

	public static void main(String[] args) {

		int[] nums = { 12, 24, 15, 63, 90, 86 };
		int target = 15;
		int ans = linearSearch(nums, target);
		System.out.println(ans);
	}

	static int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;

		}
		for (int index = 0; index < arr.length; index++) {
			// int element = arr[index];
			if (arr[index] == target) {
				return index;

			}

		}
		return -1;
	}

}
