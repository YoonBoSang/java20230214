package ch17.exercise.exam07;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		for (Member m : list) {
			if (m.getJob().equals("개발자")) {
				System.out.println(m.getName());
			}
		}
//
//		list.stream()
//				.filter(s -> s.getJob().equals("개발자"))
//				.forEach(s -> System.out.println(s.getName()));
		list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.map(Member::getName)
				.forEach(System.out::println);

//		developers
//			.forEach(m -> System.out.println(m.getName()));
	}
}
