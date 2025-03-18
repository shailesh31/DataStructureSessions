package codePractices;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(MaxSubArrayQuestion(arr));

	}

	public static int MaxSubArrayQuestion(int[] nums) {
		int curSum = 0;
		int maxSum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (curSum < 0) {
				curSum = 0;

			}
			curSum = curSum + nums[i];
			maxSum = Math.max(maxSum, curSum);
		}

		return (maxSum);
	}

}
