package ch12.lecture.p01object;

import java.lang.invoke.MethodHandles.Lookup.*;

public class C10Enum {
	public static void main(String[] args) {
		System.out.println(MyClass10.SPRING);
		System.out.println(MyClass10.SUMMER);
		System.out.println(MyClass10.FALL);
		System.out.println(MyClass10.WINTER);
	}
}

class MyClass10 {
	static final int SPRING = 1;
	static final int SUMMER = 2;
	static final int FALL = 3;
	static final int WINTER = 4;
	
}