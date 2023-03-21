package ch11.exercise.exam05;

public class Example {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			
		}
		
		try {
			method1();
		} catch (ClassNotFoundException e) {
			
		} catch (NumberFormatException e) {
			
		}
		
	}
	public static void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
	
	public static void method2() throws Exception {
		method1();
	}
}
