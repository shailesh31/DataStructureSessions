package codePractices;

public class OrderAgnosticBS {

	public static void main(String[] args) {

//		int[] nums = { -18, -9, -4, -2, 0, 1, 2, 4, 6, 44, 66, 87, 102 };
		int[] nums = { 18, 9, 4, 2, 0, -1, -2, -4, -6, -44, -66, -87, -102 };
		int target = 900;
		int ans = orderAgnosticBinarySearch(nums, target);
		System.out.println("The index of the searched Item is : " + ans);

	}

	static int orderAgnosticBinarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		// find whether array is sorted or not
		boolean isAscending = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {

				return mid;

			}

			if (isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;

				} else {
					start = mid + 1;

				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;

				} else {
					start = mid + 1;

				}

			}

		}
		return -1;
	}

}
