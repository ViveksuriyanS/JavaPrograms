package com.java.abstractidentifier;

public interface Relationship {
	String M = "John Abraham";
	String W = "Bipasha Basu";

	public void Marriage(String M, String W);

	public void BreakUp(String M, String W);

	public void InLove(String M, String W);

	public default void LiveIn(String M, String W) {
		System.out.println(M + "  " + W);
		System.out.println(this.M + " " + this.W);
	}
}

class Status implements Relationship {

	@Override
	public void Marriage(String M, String W) {
		System.out.println(M + "\t" + W);
	}

	@Override
	public void BreakUp(String M, String W) {
		System.out.println(M + "\t" + W);

	}

	@Override
	public void InLove(String M, String W) {
		System.out.println(M + "\t" + W);

	}

}