package ch06.exercise.exam20;

import java.lang.invoke.MethodHandles.Lookup.*;
import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Account[] arr1 = new Account[100]; 
		int lineCount = 0;
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1 -> {
				Account o1 = new Account();
				System.out.println("------------");
				System.out.println("계좌생성");
				System.out.println("------------");
	
				System.out.print("계좌번호: ");
				String line = scanner.next();
				o1.setLine(line);
				
				System.out.print("계좌주: ");
				String name = scanner.next();
				o1.setName(name);
				
				System.out.print("초기입금액: ");
				int money = scanner.nextInt();
				o1.setMoney(money);
				arr1[lineCount] = o1;
				lineCount++;
				
				
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2 -> {
				System.out.println("------------");
				System.out.println("계좌목록");
				System.out.println("------------");
				for(int i = 0; i < lineCount; i++) {
					System.out.printf("%7s%10s%10d%n", arr1[i].getLine(), arr1[i].getName(), arr1[i].getMoney());
				}
				

			}
			case 3 -> {
				System.out.println("------------");
				System.out.println("예금");
				System.out.println("------------");
				
				System.out.print("계좌번호: ");
				String line = scanner.next();
				System.out.println("예금액: ");
				int inputMoney = scanner.nextInt();
				for(int i = 0; i < lineCount; i++) {
					if(arr1[i].getLine().equals(line)) {
						int money = arr1[i].getMoney() + inputMoney;
						arr1[i].setMoney(money);
					}
				}
				
			}
			case 4 -> {
				System.out.println("------------");
				System.out.println("출금");
				System.out.println("------------");

				System.out.print("계좌번호: ");
				String line = scanner.next();
				System.out.println("출금액: ");
				int inputMoney = scanner.nextInt();
				for(int i = 0; i < lineCount; i++) {
					if(arr1[i].getLine().equals(line)) {
						int money = arr1[i].getMoney() - inputMoney;
						arr1[i].setMoney(money);
					}
				}
			}
			case 5 -> {
				System.out.println("프로그램 종료");
				run = false;
			}
			}
		}
	}
}
