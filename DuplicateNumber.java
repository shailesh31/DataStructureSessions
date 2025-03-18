package codePractices;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	static int[] nums = { 1, 3, 5, 7, 1 };

	public static boolean containsDuplicates(int[] nums) {

		Set<Integer> visited = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (visited.contains(nums[i])) {
				return true;
			} else {
				visited.add(nums[i]);
			}
		}

		return false;

	}

	public static void main(String[] args) {

		System.out.println(containsDuplicates(nums));

	}

}
