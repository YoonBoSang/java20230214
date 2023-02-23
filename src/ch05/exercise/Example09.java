package ch05.exercise;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int students = 0;
		int scores = 0;
		int[] arr = null;
		double sum = 0;
		int temp = 0;
		int max = 0;

		do {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");
			num1 = scanner.nextInt();

			if (num1 == 1) {
				System.out.print("학생수> ");
				students = scanner.nextInt();
			} else if (num1 == 2) {
				if (students == 0) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				arr = new int[students];
				for (int i = 0; i < students; i++) {

					System.out.print("" + (i + 1) + "번 학생 점수입력> ");
					arr[i] = scanner.nextInt();
				}
			} else if (num1 == 3) {
				if (arr == null) {
					System.out.println("점수를 먼저 기입해주세요.");
				}
				for (int i = 0; i < students; i++) {
					System.out.println("" + (i + 1) + "번째 학생 점수: " + arr[i]);
				}
			} else if (num1 == 4) {
				if (arr == null) {
					System.out.println("점수를 먼저 기입해주세요.");
					continue;
				}
//				for (int i = 1; i < arr.length; i++) {
//					for (int j = 0; j < arr.length; j++) {
//						if (arr[i] < arr[j]) {
//							temp = arr[j];
//							arr[j] = arr[i];
//							arr[i] = temp;
//						}
//					}
				for (int i = 0; i < arr.length; i++ ) {
					if (max < arr[i]) {
						max = arr[i];
					}
				}
				System.out.println("학생들중 최고 점수: " + max);
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];

				}
				System.out.println("학생들의 평균점수: " + sum / arr.length);
			}
		} while (num1 != 5);
		System.out.println();
		System.out.println("프로그램 종료.");

	}
}
