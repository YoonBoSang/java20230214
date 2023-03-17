package ch17.exercise.exam08;

import java.lang.invoke.MethodHandles.Lookup.*;
import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
//		Map<String, List<Member>> map = list.stream()
//				.collect(Collectors.groupingBy(Member::getJob));
//		
//		System.out.println("[개발자]");
//		map.get("개발자").stream()
//				.forEach(System.out::println);
//		
//		System.out.println();
//		
//		System.out.println("[디자이너]");
//		map.get("디자이너").stream()
//		.forEach(System.out::println);
//		

//		List<Member> name = new ArrayList<>();
		
		Map<String, List<Member>> map = new HashMap<>();
		for(Member str : list) {
			String key = str.getJob();
			List<Member> name = map.get(key);
			if(name == null) {
				name = new ArrayList<>();
				map.put(key, name);
			}
			
			name.add(str);
		}
		System.out.println("[개발자]");
		List<Member> dev = map.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}
		
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> des = map.get("디자이너");
		for (Member d : des) {
			System.out.println(d);
		}
				
	}
}
