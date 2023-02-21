package ch04.exercise;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			String num = scanner.nextLine();
			
			if (num.equals("1")) {
				System.out.print("예금액>");
				String money = scanner.nextLine();
				balance += Integer.parseInt(money);
				System.out.println();
			} else if (num.equals("2")) {
				System.out.print("출금액>");
				String money = scanner.nextLine();
				balance -= Integer.parseInt(money);
				if(balance < 0) {
					balance += Integer.parseInt(money);
					System.out.println("잔액이 부족합니다.");
					System.out.println("선택 화면으로 돌아갑니다.");
					continue;
				}
				System.out.println();
			} else if (num.equals("3")) {
				System.out.print("잔고>" + balance);
				System.out.println();
			} else if (num.equals("4")) {
				System.out.println();
				run = false;
			}
		}
		System.out.print("프로그램 종료");
	}
}
