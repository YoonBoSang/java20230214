package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
		int i = 3;
		int sum =0;
		int n = 1;
		while (n <= 33) {
			sum += i * n;
			n++;
		}
		System.out.println(sum);
	}
}
