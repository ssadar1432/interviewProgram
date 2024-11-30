package Beginner_program;

public class D3_P1_SwipeTwoNumber {
    public static void main(String[] args) {

        int num1=10;

        int num2=20;
        System.out.println("Before swapping:"+"number 1="+num1+",number 2="+num2);
        num1=num1+num2; //30
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swapping:"+"number 1="+num1+",number 2="+num2);


    }

}
