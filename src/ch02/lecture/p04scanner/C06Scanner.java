package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	public static void main(String[] args) {
//		String input = """
//				14 30
//				20""";
		
//		Scanner scanner = new Scanner(input);
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int num4 = num2 + num3;
		
			num1 = (num1 + (num4 / 60)) % 24;
			num4 = num4 % 60;
		System.out.println(num1 + " " + num4);
		
//		Scanner scanner = new Scanner(System.in);
//		
//		//코드 작성
//		String line1 = scanner.nextLine();
//		String line2 = scanner.nextLine();
//		
//		Scanner line1Scanner = new Scanner(line1);
//		Scanner line2Scanner = new Scanner(line2);
//		
//		int currentHour = line1Scanner.nextInt();
//		int currentMin = line1Scanner.nextInt();
//		
//		int pastMin = line2Scanner.nextInt();
//		
//		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24;
//		currentMin = (currentMin + pastMin) %60;
//		
//		System.out.println(currentHour + " " + currentMin);
//		
//		
		
		
	}
}
