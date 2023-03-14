package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	// java.util.List
	// 순서가 있는 콜렉션
	// 각 아이템(element,원소)는 index 로 접근 가능
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		// element 추가
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		// element 얻기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		
		// list 크기
		int size = list.size();
		System.out.println(size);
				
		// 특정 index의 element 지우기
		list.remove(2);
		
		System.out.println("지운후 크기 : " + list.size()); // 3
		System.out.println("지운후 2번 index의 값 : " + list.get(2)); // java
		
		// 특정 index값 바꾸기
		list.set(2, "react");
		
		
	}
}
