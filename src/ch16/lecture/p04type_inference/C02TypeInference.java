package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	// 지역변수만 가능
//	var field = 3; // x
	public static void main(String[] args) {
		// 지역변수 타입 추론
		// var 사용
		// 선언과 동시에 초기화할 때만 사용 가능
		int a = 3;
		String b = "java";
		
		var c = 5;
		var d = "";
		var e = 'c';
		var f = true;
		
//		값으로 타입을 추론함으로 var를 타입으로 할때는 초기화와 동시에 값을 줘야함
//		var g; // x
//		g = 6; // x
		
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		var box3 = new Box<String>();
		
		var list1 = new ArrayList<List<String>>();
		
		//재할당시 같은 타입만 가능
		var g = 10; // int로 추론
		g = 11; 	// ok
//		g = 3.14; // x
		
		// var 사용시 읽기 쉬운 코드인가??
		var list2 = new ArrayList<String>();
		
		// 긴 코드.....
		
		for(String item : list2) {
			
		}
		
		// 권장하지 않음
		for(var item : list2) {
			
		}
		
		// var는 키워드가 아님
		int var = 3; // 사용 가능 하지만 변수명으로 사용하지 말 것
	}
}
