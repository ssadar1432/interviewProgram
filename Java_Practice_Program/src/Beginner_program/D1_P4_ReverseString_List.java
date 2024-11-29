package Beginner_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class D1_P4_ReverseString_List {
	
	public static void main(String[] args) {
		
	
	String s1="Sachin";
	
	char[] ar=s1.toCharArray();
	
	List<Character> li=new ArrayList<>();
	
	for(char ch:ar) {
		
		li.add(ch);
	}

	Collections.reverse(li);
	
	//System.out.print(li);
	Iterator itr=li.iterator();
	
	while(itr.hasNext()) {
		
		System.out.print(itr.next());
	}
}
	}
