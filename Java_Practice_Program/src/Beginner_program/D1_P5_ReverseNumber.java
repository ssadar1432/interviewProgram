package Beginner_program;

public class D1_P5_ReverseNumber {

	
	public static void main(String[] args) {
		
		int number=12345;
		int reminder;
		int reverse = 0;
		
		while(number>0) {
			reminder=number%10;
			number=number/10;
			reverse=reverse*10+reminder;
			
			
		}
		System.out.println(reverse);
	}
}
