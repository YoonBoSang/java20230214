package ch07.lecture.p01inheritance;

public class C01Inheritance {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		o1.field1 = "aaa";
		o1.field2 = 99;
		
		MyClass01 o2 = new MyClass01();
		o2.method1();
		o2.method2();
		
		o1.method1();
		o1.method2();
		
	}
}
