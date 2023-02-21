package ch04.exercise;

public class Example_04 {
	public static void main(String[] args) {
		int num1;
		int num2;
		while (true) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			if(num1 + num2 == 5) {
				break;
			}
		}
		System.out.printf("(%d, %d)", num1, num2);
	}
}
