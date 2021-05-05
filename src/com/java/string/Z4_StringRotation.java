package com.java.string;

public class Z4_StringRotation {

	public static void main(String[] args) {
		String st = "CDEAB";
		String st1 = "ABCDE";
		
		st = st+st;
		if(st.contains(st1)) {
			System.out.println("String rotated");
		}
	}

}
