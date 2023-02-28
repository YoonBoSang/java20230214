package ch06.lecture.p04static;

public class MyClass03 {
		// instance member끼리 접근 가능
	
		String name;
		
		void hello() {
			System.out.println(name + "님 안녕하세요.");
			System.out.println("오늘은 " + Now() + "입니다.");
		}
		
		String Now() {
			return "2023년 2월 28일";
		}
		
	}
