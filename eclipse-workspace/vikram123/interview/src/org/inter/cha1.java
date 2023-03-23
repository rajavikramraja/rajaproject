
package org.inter;

import java.util.Scanner;

public class cha1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("What is studentId?");
		String n = s.nextLine();
		System.out.println("studendid is " + n);

		System.out.println("What is studentName?");
		String a = s.nextLine();
		System.out.println("studendName is " + a);

		System.out.println("What is your Mark1?");
		long b = s.nextLong();
		System.out.println("Mark1 is " + b);

		System.out.println("What is your Mark2?");
		long c = s.nextLong();
		System.out.println("Mark2 is " + c);

		System.out.println("What is your Mark3?");
		long d = s.nextLong();
		System.out.println("Mark3 is " + d);

		System.out.println("What is your Mark4?");
		long e = s.nextLong();
		System.out.println("Mark4 is " + e);

		System.out.println("What is your Mark5?");
		long f = s.nextLong();
		System.out.println("Mark5 is " + f);
		
		long g =b+c+d+e+f;
		System.out.println("Total mark" +g);
		
		float h =g/5;
		System.out.println("Average " +h);
		
		
		
	}

}
