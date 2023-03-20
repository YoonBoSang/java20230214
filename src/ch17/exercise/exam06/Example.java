package ch17.exercise.exam06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		int sum = 0;
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
//		for(Member m : list) {
//			sum += m.getAge();
//		}
//		double avg = (double)sum / list.size();
		
		double avg = list.stream()
				.mapToInt(s -> s.getAge())
				.average()
				.getAsDouble();
		
		System.out.println("평균 나이: " + avg);
		
		Double avg2 = list.stream()
			.collect(Collectors.averagingDouble(Member::getAge));
		
		System.out.println("평균 나이: " + avg2);
		
	}
}
