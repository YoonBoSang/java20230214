package ch05.lecture.p08regex;

public class C17Regex {
	public static void main(String[] args) {
		// 영문대소문자, $, _, 숫자
		// 단, 숫자가 앞에 오면 안됨
		
		String pattern1 = "[a-zA-Z$_]+[a-zA-Z$_0-9]*";
		
		System.out.println("modelName".matches(pattern1));
		System.out.println("class".matches(pattern1));
		System.out.println("$value".matches(pattern1));
		System.out.println("_age".matches(pattern1));
		System.out.println("int".matches(pattern1));
		System.out.println("6hour".matches(pattern1));
		System.out.println("#name".matches(pattern1));
		
//		char a = '1';
//		int i = Character.getNumericValue(a);
//		System.out.println(i);
		
//		int a = 1234
		String a = String.va"1234";
		int i = Integer.parseInt(a);
		System.out.println(i);
	}
}
