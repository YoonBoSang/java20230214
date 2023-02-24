package ch05.lecture.p08regex;

public class C11Regex {
	public static void main(String[] args) {
		// 010으로 시작하고, - 기호, 숫자 4개, - 기호, 숫자 4개
		
		String pattern = "010-[0-9]{4}-[0-9]{4}";
		
		System.out.println("010-9999-7777".matches("010-[0-9]{4}-[0-9]{4}"));
		System.out.println("010-9876-7654".matches(pattern));
		System.out.println("010-99957777".matches(pattern));
		System.out.println("010-9999-777".matches(pattern));
	}
}
