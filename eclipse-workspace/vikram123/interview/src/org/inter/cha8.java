package org.inter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class cha8 {
	public static void main(String[] args) {
		
	
	Map<Integer, String> s=new HashMap<Integer, String>();
s.put(10, "java");	
s.put(20, "sql");	
s.put(30, "oops");	
s.put(40, "Sql");	
s.put(50, "oracle");	
s.put(60, "DB");	
s.put(10, "Selenium");	
s.put(50, "psql");	
s.put(40, "Hadoop");	
Collection<String> k = s.values();
System.out.println(k);
Set<Integer> j = s.keySet();
System.out.println(j);
}}
