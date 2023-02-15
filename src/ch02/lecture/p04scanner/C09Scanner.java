package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total = scanner.nextInt();
		int loop = scanner.nextInt();

		for (int i = 0; i < loop; i++) {
			int price = scanner.nextInt();
			int qty = scanner.nextInt();

			total -= (price * qty);
		}

		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
