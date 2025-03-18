package codePractices;

public class PeakIndexArray {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 5, 7, 8, 12, 14, 9, 6, 3, 1 };
//		 int target = 900;
		int ans = peakArray(nums);
		System.out.println("The index of the searched Item is : " + ans);

	}

	static int peakArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {

				end = mid;

			} else {
				start = mid + 1;

			}
		}
		return start;
	}

}
