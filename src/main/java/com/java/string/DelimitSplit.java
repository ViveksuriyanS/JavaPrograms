package com.java.string;

import java.util.LinkedList;
import java.util.List;

public class DelimitSplit {

	public static void main(String[] args) {
		List<String> numbersWithoutCode = new LinkedList<String>();
		String phoneNums[] = { "+91 1010101010", "1111111111" };
		for (String phNum : phoneNums) {
			String nums[] = phNum.split(" ");
			if (nums.length > 1) {
				numbersWithoutCode.add(nums[1]);
			} else {
				numbersWithoutCode.add(phNum);
			}
		}
		
		System.out.println(numbersWithoutCode);
	}

}
