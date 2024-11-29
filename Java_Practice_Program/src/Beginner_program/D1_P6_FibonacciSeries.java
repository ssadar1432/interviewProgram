package Beginner_program;

public class D1_P6_FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		int n=10;
		int first=0;
		int second=1;
		int temp;
		System.out.print("FibonacciSeries: "+ first+" "+second+" ");
		for(int i=0;i<n;i++) {
			
			temp=first+second; //1   2  3  5
			first=second;// f=1 s=1  1  2  3
			second=temp; // s=1      2  3
			System.out.print(temp+" ");
			
		}
	}

}
