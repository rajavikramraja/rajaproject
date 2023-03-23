package org.inter;

import java.util.ArrayList;
import java.util.List;

public class cha5 {
	public static void main(String[] args) {
		List< Long> l =new ArrayList<>();
		l.add(200l);
		l.add(600l);
		l.add(100l);
		l.add(700l);
		l.add(900l);
		
		l.set(2, 150l);
		System.out.println(l);
	}

}
