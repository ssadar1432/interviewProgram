package Beginner_program;

public class D2_P3_findPalidrome {
	public static void main(String...args){
		
        String inputString="aabaa"; //String to be reversed     
       
        System.out.println(isPalindrome(inputString) ? inputString+ " is a palindrome." :  inputString+ "is not a palindrome.");     
   
        palidrome();
	}
    
	
    /*
     * returns true if inputString is palindrome.
     */
    public static boolean isPalindrome(String inputString){
        char ar[]=inputString.toCharArray();
        for(int i=0,j=ar.length-1; i<(ar.length/2); i++,j--){
               if(ar[i]!=ar[j])
                     return false;
        }
        return true;
    }

    public static void palidrome() {
    String s1="Sadar";
	
	char[]ar=s1.toCharArray();
	String reverseString="";
	
	for(int i=ar.length-1; i>=0;i--) {
		
		reverseString=reverseString+ar[i];
		}
	if(s1.equals(reverseString)) {
		System.out.println(s1 + " is a Palindrome String.");
    }
    else {
      System.out.println(s1 + " is not a Palindrome String.");
    }
	
    }
}
