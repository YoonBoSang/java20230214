package ch15.exercise.exam0507;

import java.util.*;

public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		List<Integer> scores = new ArrayList<>();
		int sum = 0;
		int max = Integer.MIN_VALUE;

		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			int key = scanner.nextInt();
			int k = 0;
			switch (key) {
			case 1: {
				System.out.print("학생수> ");
				int a = scanner.nextInt();
				for (int i = 0; i < a; i++) {
					scores.add(i);
				}
				continue;
			}
			case 2: {
				for (int i = 0; i < scores.size(); i++) {
					System.out.print("scores[" + i + "]> ");
					scores.set(i, scanner.nextInt());
				}
				continue;
			}
			case 3: {
				for(int i : scores) {
					System.out.println("scores[" + k + "]: " + i);
					k++;
				}
				k = 0;
				continue;
			}
			case 4: {
				for (int i : scores) {
					sum += i;
					if (max < i) {
						max = i;
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double)sum / scores.size());
				continue;
			}
			case 5: {
				System.out.println("프로그램 종료");
				run = false;
			}
			}
		}
	}
}
