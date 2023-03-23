package org.inter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class cha7 {
	public static void main(String[] args) {
		Map<Integer, String> m =new TreeMap<>();
		m.put(10, "Java");
		m.put(20, "sql");
		m.put(30, "Oops");
		m.put(40, "Selenium");
		Set<Entry<Integer, String>> e = m.entrySet();
	for (Entry<Integer, String> entry : e) {
		Integer key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key +"\n"+value);
	}

	}
}