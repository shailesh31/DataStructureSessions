
public class LinerSearchWithExtFor {

	public static void main(String[] args) {

		int[] nums = { 12, 24, 15, 63, 90, 86, -90, -40 };
		int target = 90;
		int ans = linearSearch2(nums, target);
		System.out.println(ans);
	}

	static int linearSearch2(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;

		}
		for (int element : arr) {

			if (element == target) {
				return element;

			}

		}
		return Integer.MAX_VALUE;
	}

}
