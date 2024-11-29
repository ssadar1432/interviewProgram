package Beginner_program;

import java.util.Scanner;

public class D2_P1_PrimeNumber {

	
	public static void main(String[] args) {
		
		System.out.println("Enter Number To check weather It Prime or Not");
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		for(int i=2;i<=(number/2);i++) {
		//for(int i=2;i<=Math.sqrt(number);i++) {
			
			if(number%i==0) {
				System.out.println("Number is not prime");
			}
		}
		System.out.println("Number is  Prime==");
			
		
	}
	
}
