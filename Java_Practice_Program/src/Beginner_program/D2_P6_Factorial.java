package Beginner_program;

public class D2_P6_Factorial {

	
	public static void main(String[] args) {
		
		
		int number= 4;
		int factorial=1;
		 //5*4*3*2*1
		
		while(number>0) {
			
			factorial=factorial*number; // 1*4=4 -> 4*3=12 ->12*2=24 ->21*1=24
			number--;
		}
		 System.out.println(factorial);
	}
}
