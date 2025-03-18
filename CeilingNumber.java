package codePractices;

public class CeilingNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 18;
		int ans = ceilingNumber(nums, target);
		System.out.println("The index of the searched Item is : " + ans);

	}

//return the index of smallest number greater than equal to target
	static int ceilingNumber(int[] arr, int target) {

		if (target > arr[arr.length - 1]) {
			return -1;
		}

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
		return start;

	}

}
