package studio1;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("The year is: ");
		year = scan.nextInt();
		
		
		boolean leapYear = (year % 400 == 0 ||(year %4 == 0) && (year %100 != 0));
		System.out.println(leapYear);
	}

}
