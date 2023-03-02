package ch06.lecture.p09package;

import static java.lang.Math.*;

public class C08StaticImportAll {
	public static void main(String[] args) {
		
//		int num1 = (int)Math.floor(Math.random() * 6) + 1;
//		int num2 = (int)Math.floor(Math.random() * 6) + 1;
		
		int num1 = (int)floor(random() * 6) + 1;
		int num2 = (int)floor(random() * 6) + 1;
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
