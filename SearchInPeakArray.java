package codePractices;

public class SearchInPeakArray {

	public static void main(String[] args) {

	}

	static int search(int[] arr, int target) {

		int peak = peakIndexInMtArray(arr);
		int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;

		}
		return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
	}

	static int peakIndexInMtArray(int[] arr) {

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

	static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

//		int start = 0;
//		int end = arr.length - 1;

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
