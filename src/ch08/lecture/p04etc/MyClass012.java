package ch08.lecture.p04etc;

public class MyClass012 implements MyInterface01 {
	@Override
	public void method1() {
		System.out.println("class012 override");
	}
	@Override
	public void method2() {
		System.out.println("class012에서 재정의한 default 인터페이스");
	}
}
