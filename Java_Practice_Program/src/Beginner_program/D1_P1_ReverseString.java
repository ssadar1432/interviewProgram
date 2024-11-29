package Beginner_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class D1_P1_ReverseString {
	
	public static void main(String[] args) {
		
		String s1="Sachin";
		String newString = "";
				
		char ch;
		
		for(int i=0;i<s1.length();i++) {
			
			ch=s1.charAt(i);
			
			newString=ch+newString;
			
		}
		System.out.println(newString);
		
		
		System.out.println("++++++++++++========+++++++++");
		
		ReverseString();
		System.out.println("++++++++++++========+++++++++");
		ReverseStringCharArr();
		System.out.println("++++++++++++========+++++++++");
		ReverseStringStringBuffer();
		System.out.println("++++++++++++========+++++++++");
		reverseStringUsingList();
		
	}
	public static void ReverseString(){


		String s1="Arav";

		char ch;

		String newStr="";

		for(int i=0;i<s1.length();i++){

		ch=s1.charAt(i);

		newStr=ch+newStr;

		}
		
		System.out.print(newStr);

		}
		//++++++++++++++===================++++++++++++++++++++++++
		public static void ReverseStringCharArr(){

		String s1="Sadar";

		char ar[]=s1.toCharArray();
		
		for(int i=ar.length-1; i>=0;i--){

		System.out.print(ar[i]);
		}
		}
		//++++++++++++++===================++++++++++++++++++++++++

		public static  void ReverseStringStringBuffer(){

		String S1="Patil";

		StringBuffer bf=new StringBuffer(S1);
		 bf.reverse();
		System.out.print(bf);

		}
		//++++++++++++++===================++++++++++++++++++++++++

		public static void reverseStringUsingList(){

		String s1="Sachin";

		char [] ar=s1.toCharArray();

		List<Character> li=new ArrayList<>();

		for(char ch:ar){

		li.add(ch);
		}

		Collections.reverse(li);

		Iterator itr=li.iterator();

		while(itr.hasNext()){

		System.out.print(itr.next());
		}



		}


}
