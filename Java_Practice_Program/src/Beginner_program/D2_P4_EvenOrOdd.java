package Beginner_program;

import java.util.Scanner;

public class D2_P4_EvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
