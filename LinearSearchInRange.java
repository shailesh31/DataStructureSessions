package codePractices;

public class LinearSearchInRange {

	public static void main(String[] args) {
		int[] nums = { 12, 34, 52, 15, 23, 37, 89, 90, 75, 63 };
		int target = 63;
		int start = 1;
		int end = 9;
		System.out.println(linearSearch(nums, target, start, end));

	}

	static int linearSearch(int[] arr, int target, int start, int end) {

		if (arr.length == 0) {
			return -1;

		}

		for (int index = start; index <= end; index++) {
			// check for every element if it is =target
			int element = arr[index];
			if (element == target) {
				return index;

			}
		}
		return -1;

	}

}
