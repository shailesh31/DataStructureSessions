package codePractices;

public class FindMinimum {

	public static void main(String[] args) {
		int[] nums = { -18, -9, -4, -2, 0, 1, 2, 4, 6, 44, 66, 87, 102 };
		int ans = binarySearch(nums);
		System.out.println("The minimum of the arr Item is : " + ans);

	}

	static int binarySearch(int[] arr) {

		if (arr.length == 1) {
			return arr[0];

		}

		int start = 0;
		int end = arr.length - 1;
		int ans = arr[0];

		while (start <= end) {

			if (arr[start] < arr[end]) {
				ans = Math.min(ans, arr[start]);
			}
			// so that it wont go beyond int range else we can do mid=( start+end)/2

			int mid = start + (end - start) / 2;
			ans = Math.min(ans, arr[mid]);

			if (arr[start] <= arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return ans;

	}

}
