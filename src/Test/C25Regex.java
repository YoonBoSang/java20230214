package Test;

public class C25Regex {
	public static void main(String[] args) {
		
	// unicode script
	// \p{IsaHangul}
	// 한글 [가-힣]
	
	String pattern1 = "[가-힣]";
	String pattern2 = "\\p{IsHangul}";
	
	System.out.println("백".matches(pattern1));
	System.out.println("두".matches(pattern2));
	System.out.println("산".matches(pattern2));
	
	// 공백없이 한글 2굴자 이상
	String pattern3 = "\\p{IsHangul}{2,}";
	System.out.println("두산".matches(pattern3));
	System.out.println("백두산".matches(pattern3));
	System.out.println("산".matches(pattern3));
	}
}
