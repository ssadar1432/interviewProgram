package Beginner_program;

public class D2_P2_SumOfDigit {
	
	public static void main(String[] args) {
		
		
		int number = 123;
		int sum=0;
		int reminder;
		
	while(number>0) {
		
		reminder=number%10;  //3     2    1
		number=number/10;    //12    1    1
		sum=sum+reminder;    //0+3   3+2   5+1
		
		
	}
	System.out.println(sum);
		
		
	}

}
