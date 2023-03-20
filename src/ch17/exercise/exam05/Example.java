package ch17.exercise.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lamda Exmpresstion",
				"Java8 supports lambda expression"
				);
		
//		for(String s : list) {
//			if(s.toLowerCase().contains("java")) {
//				System.out.println(s);
//			}
//		}
		
		list.stream()
//			.filter(s -> s.toLowerCase().contains("java"))
			.filter(Example::havingJava)
			.forEach(s -> System.out.println(s));
	}
	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
		
	}
}
