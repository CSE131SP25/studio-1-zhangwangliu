package studio1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		Scanner s1 = new Scanner(System.in);
		
		int n2;
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("The first integer: ");
		n1 = s1.nextInt();
		
		System.out.println("The second integer: ");
		n2 = s2.nextInt();
		
		double average = ((n1 + n2) / 2.0);
		System.out.println("The average of " + n1 + " and " + n2 + " is: " + average);
		
	}

}
