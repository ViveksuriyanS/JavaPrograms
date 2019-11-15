package com.toString;



public class ToStringEg {

	int hour;
	int minute;
	int second;
	
	public static void main(String[] args) {
		ToStringEg obj = new ToStringEg(5,6,7);

	}

	public ToStringEg(int hour,int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		// this object implicitly calls toString
		System.out.println(this);
	}
	
	public String toString(){
		return String.format("%d:%d:%d", hour,minute,second);
	}
}
