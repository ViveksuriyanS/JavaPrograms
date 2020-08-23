package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VersionInfo {

	public static void main(String[] args) throws IOException {
		String filename = "iox.txt";
		// Reading the data from the file
		FileReader fileIStream = new FileReader(filename);
		BufferedReader inputStream = new BufferedReader(fileIStream);
		String i;
		Map<String, String> l = new HashMap<String, String>();
		Set<String> result = new HashSet<String>();
		String[] split;
		while ((i = inputStream.readLine()) != null) {
			split = i.split(",");
			String val = split[0] + "#" + split[2];
			if (l.get(split[1]) == null) {
				l.put(split[1], val);
			} else {
				String val1 = l.get(split[1]);
				String[] x = val1.split("# ");
				Integer version = Integer.parseInt(x[1].replaceAll("v", ""));
				String y = split[2].replaceAll("v", "").trim();
				Integer newVersion = Integer.parseInt(y);
				if(version < newVersion) {
					l.put(split[1], val);
					result.add(x[0]);
				}

			}
		}
		System.out.println(result);
		inputStream.close();

	}

}
