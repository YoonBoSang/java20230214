package ch16.lecture.p03reference;

public class C01MethodReference {
	
	public static void main(String[] args) {
		MyInterface01 o1 = a -> System.out.println(a);
		MyInterface01 o2 = a -> MyClass01.method(a);
		MyInterface01 o4 = new MyInterface01() {
			public void action(int a) {
				System.out.println(a);
			}
		};
		o2.action(3);
		o4.action(0);

		
		// method reference (스태틱 메소드 참조)
		MyInterface01 o3 = MyClass01::method;
		
		
	}
}

interface MyInterface01 {
	void action(int a);
}

class MyClass01 {
	public static void method(int a) {
		System.out.println(a);
	}
}