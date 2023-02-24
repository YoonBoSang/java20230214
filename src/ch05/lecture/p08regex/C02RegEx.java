package ch05.lecture.p08regex;

public class C02RegEx {
	public static void main(String[] args) {
		// matches
		// 패턴에 맞으면 true, 그렇지 않으면 false
		
		String str1 = "abc";
		System.out.println("a".matches("a"));
		System.out.println("b".matches("a"));
		System.out.println("c".matches("c"));
		System.out.println(str1.matches("abc"));
		
	}
}
