package codePractices;

public class MissingElement {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 5 };
		int n1 = findMissingNumber(num, num.length + 1);
		System.out.println("Missing number is :" + n1);

	}

	public static int findMissingNumber(int num[], int totalCount) {

		int expSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;

		for (int i : num) {
			actualSum += i;
		}
		return expSum - actualSum;

	}

}
