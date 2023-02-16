package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	public static void main(String[] args) {
		//백준 11021번 문제
		String input = """
				5
				3 4
				1 1
				9 8
				2 3
				5 2
				""";
		Scanner scanner = new Scanner(input);
		
		int loop = scanner.nextInt();
		
		for (int i = 1; i <= loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.printf("Case #%2$d: %1$d%n", a+b, i);
//			System.out.println("Case #" + i + ": " + (a +b));
		}
	}
}
