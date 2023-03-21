package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {
		try {
		method1();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("continue....");
	}
	public static void method2() throws Throwable{
		throw new ClassNotFoundException();
	}
	
	public static void method1() {
		
		throw new ClassCastException();
	}
}
