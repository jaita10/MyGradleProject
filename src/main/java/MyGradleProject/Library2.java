package MyGradleProject;

import java.util.Scanner;

public class Library2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.println("Sum of the numbers is: "+(a+b));

	}

}
