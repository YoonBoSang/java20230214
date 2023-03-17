package ch17.lecture.p02terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		
		Integer stream1 = list.stream()
			.map(e -> e.length())
//			.reduce((a, b) -> a + b)
			.reduce(Integer::sum)
			.get();
		
		System.out.println(stream1);
	}
}
