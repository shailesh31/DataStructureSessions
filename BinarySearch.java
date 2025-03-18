package codePractices;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { -18, -9, -4, -2, 0, 1, 2, 4, 6, 44, 66, 87, 102 };
		int target = 4;
		int ans = binarySearch(nums, target);
		System.out.println("The index of the searched Item is : " + ans);

	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			// so that it wont go beyond int range else we can do mid=( start+end)/2

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;

			} else {
				return mid;
			}

		}
		return -1;

	}

}
