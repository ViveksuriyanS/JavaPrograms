package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class MapSortByValue {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 1);
		map.put(5, 1);
		map.put(7, 1);
		map.put(6, 1);
		map.put(4, 1);
		map.put(3, 1);
		System.out.println(map.entrySet());
	}

}
