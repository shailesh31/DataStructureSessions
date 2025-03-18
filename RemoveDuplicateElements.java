package CodingPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 0, 4, 4, 2, 5, 5, 2, 1, 3, 6, 7,
				8, 9, 6, 6, 6, 5, 5, 4, 3, 4, 6, 8, 9, 1, 2, 3, 4, 5, 6, 7, 1, 8, 9, 0));

		// 1-LinkedHashSet

		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(arrayList);

		ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>(hashSet);
		System.out.println("List of Elements without duplicate : " + listWithoutDuplicates);

		System.out
				.println("------------------------------------------------------------------------------------------");

		// 2-JDK 8 Streams

		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 0, 4, 4, 2, 5, 5, 2, 1, 3, 6, 7,
				8, 9, 6, 6, 6, 5, 5, 4, 3, 4, 6, 8, 9, 1, 2, 3, 4, 5, 6, 7, 1, 8, 9, 0));

		List<Integer> uniqueMarksList = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println("List of Unique Elements : " + uniqueMarksList);

	}
}
