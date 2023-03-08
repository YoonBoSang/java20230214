package ch08.lecture.p05cast;

import java.io.*;
import java.lang.constant.*;

public class C05Instanceof {
	public static void main(String[] args) {
//		method("java");
//		method(new StringBuilder("java"));
		method(new StringBuffer(""));
	}
	
	public static void method(CharSequence c) {
		System.out.println(c instanceof String);			//x
		System.out.println(c instanceof Object);			//o
		System.out.println(c instanceof CharSequence);		//o
		System.out.println(c instanceof Comparable);		//o
		System.out.println(c instanceof Serializable);		//o
		System.out.println(c instanceof Constable);			//x
		System.out.println(c instanceof ConstantDesc);		//x
	}
}
