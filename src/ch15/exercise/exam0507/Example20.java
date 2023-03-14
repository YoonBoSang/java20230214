package ch15.exercise.exam0507;

import java.util.*;

public class Example20 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<MyClass20> myClass0 = new ArrayList<>();
		boolean run = true;

//		list.add();
		while (run) {

			System.out.print("""
					--------------------------------------------------
					1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
					--------------------------------------------------
					""");
			System.out.print("선택>");
			int key = scanner.nextInt();
			switch (key) {
			case 1 -> {
				System.out.print("""
						----------
						계좌생성
						----------
						""");
				System.out.print("계좌번호: ");
				String account = scanner.next(); 
				System.out.print("계좌주: ");
				String name = scanner.next();
				System.out.print("초기입금액: ");
				int saveMoney = scanner.nextInt();
				MyClass20 myClass1 = new MyClass20(account, name, saveMoney);
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				myClass0.add(myClass1);
//				continue;
			}
			case 2 -> {
				System.out.print("""
						----------
						계좌목록
						----------
						""");
				for(MyClass20 i : myClass0) {
					System.out.printf("%s%7s%7d\n", i.getAccount(), i.getName(), i.getSaveMoney());
				}
				
			}
			case 3 -> {
				System.out.print("""
						----------
						예금
						----------
						""");
				System.out.print("계좌번호: ");
				String account = scanner.next();
				System.out.print("예금액: ");
				int inputMoney = scanner.nextInt();
				for(MyClass20 i : myClass0) {
					if(account.equals(i.getAccount())) {
						int saveMoney = i.getSaveMoney() + inputMoney;
						i.setSaveMoney(saveMoney);
					}
				}
			}
			case 4 -> {
				System.out.print("""
						----------
						출금
						----------
						""");
				System.out.print("계좌번호: ");
				String account = scanner.next();
				System.out.print("출금액: ");
				int inputMoney = scanner.nextInt();
				for(MyClass20 i : myClass0) {
					if(account.equals(i.getAccount())) {
						int saveMoney = i.getSaveMoney() - inputMoney;
						i.setSaveMoney(saveMoney);
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

class MyClass20 {
	private String account;
	private String name;
	private int saveMoney;
	
	public MyClass20(String account, String name, int saveMoney) {
		this.account = account;
		this.name = name;
		this.saveMoney = saveMoney;
	}

	public String getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public int getSaveMoney() {
		return saveMoney;
	}

	public void setSaveMoney(int saveMoney) {
		this.saveMoney = saveMoney;
	}
}

