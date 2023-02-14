package ch02.lecture.p02type;

public class C05Long {
	public static void main(String[] args) {
		// long = (8bytes, 64bits);
		// 가장 큰 값 = 9223372036854775807
		// 가장 작은 값 = -9223372036854775808
		
		long l1 = 2147483647; // o
		l1 = 2147483648L; // long 타입 수는 끝에 (L) 붙임
		l1 = 999_8273_4197_4192L;
		l1 = -999_929_837_972_592L;
	}
}
