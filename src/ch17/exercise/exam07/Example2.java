package ch17.exercise.exam07;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
//		
//		for(Member m : list) {
//			if(m.getJob().equals("개발자")) {
//				System.out.println(m.getName());
//			}
//		}
		
			List<Member> developers = list.stream()
					.filter(s -> s.getJob().equals("개발자"))
					.toList();
//					.collect(Collectors.toList());
				
		developers.stream()
			.forEach(m -> System.out.println(m.getName()));
	}
}
