package codePractices;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Leap Year program\n");
		System.out.print("Please enter year you want to check :--");
		int year = input.nextInt();
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println("The year you entered is not a Leap Year");
		}

	}

}
