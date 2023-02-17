package Test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		String input = """
				71
				""";
		
		Scanner scanner = new Scanner(input);
		
		int N = scanner.nextInt();
		int NC = N;
		int num = 0;
		int sum = 0;
		for (int i = 0; N == num; i++) {
			int FC = NC / 10 + NC % 10;  		//10의자리 1의자리 더한값 넣기
			num = (NC % 10) * 10 + FC % 10;		//양변 첫번째 자리 합치기
			NC = num;
			System.out.println(N);
			System.out.println(num);
			
			System.out.println(i);
		}
//		do {
//		int FC = N / 10 + N % 10;  			//10의자리 1의자리 더한값 넣기
//		num = (N % 10) * 10 + FC % 10;		//양변 첫번째 자리 합치기
////		NC = num;
//		sum += 1;
//		System.out.println(NC);
//		System.out.println(num);
//		System.out.println(N);
//		
//		} while (N == num);
//		System.out.println(sum);
	}
}
