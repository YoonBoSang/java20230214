package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	public static void main(String[] args) {
		String input = """
				4 5
				""";
		
		Scanner scanner = new Scanner(input);
		
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		
		double sum = A / B;
		System.out.println(""+  (int)A + " / " + "" + (int)B + " = "   + sum);
		System.out.println(sum);
	}
}
