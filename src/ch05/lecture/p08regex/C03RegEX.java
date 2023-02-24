package ch05.lecture.p08regex;

public class C03RegEX {
	public static void main(String[] args) {
		// character class(문자분류)
		
		String str1 = "[abc]";
		
		System.out.println("a".matches("[abc]"));
		System.out.println("a".matches("abc"));
		System.out.println("b".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		System.out.println("a".matches(str1));
	}
}
