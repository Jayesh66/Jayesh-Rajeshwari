package com.java;

public class Hello_World {
	public static void main(String [] args) {
	String [] arr = {"madaM","Jqaye","eye","nayan"};
	
	String rev ="";
	for(String s1: arr) {
		String lc = s1.toLowerCase();
		for(int i =lc.length()-1; i>=0;i--) {
			char ch = s1.charAt(i);
			rev = rev + ch;
			
			
		}
		if(rev.equals(lc)) {System.out.println(s1+" is paLINDOME");}
		else {System.out.println(s1 + " is not");}
	}
	
	
	}
}
