package Beginner_program;

public class D2_P5_Amsrtong {
	
	public static void main(String[] args) {
		
		 int number = 153;
         int sum = 0;
         int temp = number;   //temp will hold reference to number.
         while (temp > 0) {
                int rem = temp % 10;
                sum = sum+rem * rem * rem; 
                temp = temp / 10;
         }

         System.out.println(sum); 
         if (number == sum)
                System.out.println(number + " is armstrong number.");
         else
                System.out.println(number + " is not armstrong number.");
  }

}
