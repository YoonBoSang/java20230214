package ch04.exercise;

public class Example05 {
	public static void main(String[] args) {
		//4x + 5y =60 의 모든 해 (x, y)로 출력 x,y는 10이하 자연수
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int result = (4 * x) + (5 * y);
				
				if (result == 60) {
					System.out.printf("(%d, %d)%n", x, y);
				}
			}
		}
	}
}
