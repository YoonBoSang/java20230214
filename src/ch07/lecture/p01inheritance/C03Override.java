package ch07.lecture.p01inheritance;

public class C03Override {
	public static void main(String[] args) {
		SubClass03 o1 = new SubClass03();
		SuperClass03 o2 = new SuperClass03();
		
		o1.method1();
		o2.method2();
		o1.method2();
		o1.method3();
	}
}
