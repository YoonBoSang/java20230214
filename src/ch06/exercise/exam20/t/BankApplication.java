package ch06.exercise.exam20.t;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[100];
		int numOfAccounts = 0;
		boolean run  = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택>");
			
			
			int menu = scanner.nextInt();
			
			
			switch(menu) {
			case 1 -> {
				//계좌생성
				System.out.println("------------");
				System.out.println("계좌생성");
				System.out.println("------------");
				
				System.out.println("계좌번호: ");
				String number = scanner.next();
				
				System.out.println("계좌주: ");
				String name = scanner.next();
				
				System.out.println("초기입금액: ");
				int money = scanner.nextInt();
				
				Account account = new Account();
				account.setNumber(number);
				account.setName(name);
				account.setMoney(money);
				accounts[numOfAccounts] = account;
				numOfAccounts++;
				
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2 -> {
				System.out.println("--------------");
				System.out.println("계좌목록");
				System.out.println("--------------");
				
				for (int i = 0; i <numOfAccounts; i++) {
					System.out.printf("%7s%10s%10d%n",accounts[i].getNumber(), accounts[i].getName(), accounts[i].getMoney());
				}
				
			}
			case 3 -> {
				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				
				System.out.println("계좌번호: ");
				String number = scanner.next();
				
				System.out.println("예금액: ");
				int inputMoney = scanner.nextInt();
				
				// 입력된 계좌번호를 가진 Account 객체 찾아서
				for(int i = 0; i < numOfAccounts; i++) {
					Account cur = accounts[i];
					if (cur.getNumber().equals(number)) {
						// 입력 받은 금앨을 더해서 다시 넣어준다(set)
						int money = cur.getMoney() + inputMoney;
						cur.setMoney(money);
						
					}
				}
			}
			case 4 -> {
				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");
				
				System.out.println("계좌번호: ");
				String number = scanner.next();
				
				System.out.println("출금액: ");
				int inputMoney = scanner.nextInt();
				
				// 입력된 계좌번호를 가진 Account 객체 찾아서
				for(int i = 0; i < numOfAccounts; i++) {
					Account cur = accounts[i];
					if (cur.getNumber().equals(number)) {
						// 입력 받은 금앨을 더해서 다시 넣어준다(set)
						int money = cur.getMoney() - inputMoney;
						cur.setMoney(money);
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
