package codePractices;

public class InfiniteArray {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
		int target = 10;

		System.out.println("The index of the searched Item is : " + ans(arr, target));

	}

	static int ans(int[] arr, int target) {
		// first find the range
		// first start with the box of size 2
		int start = 0;
		int end = 1;

		// condition for target to be lying in the range
		while (target > arr[end]) {
			int temp = end + 1;// new start
			// double the box value
			// end=previous end +size of box *2
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		return binarySearch(arr, target, start, end);

	}

	static int binarySearch(int[] arr, int target, int start, int end) {

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
