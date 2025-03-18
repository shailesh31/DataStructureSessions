package codePractices;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to grading program\n");
		System.out.print("Please enter your percentage:--");
		float percentage = input.nextFloat();

		if (percentage >= 90) {
			System.out.println("your grade is A");
		} else if (percentage >= 75) {
			System.out.println("your grade is B");

		} else if (percentage >= 60) {
			System.out.println("your grade is C");

		} else if (percentage >= 30) {
			System.out.println("your grade is D");
		} else {
			System.out.println("you have failed and grade is F");
		}

	}
}
