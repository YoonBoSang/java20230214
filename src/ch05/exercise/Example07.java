package ch05.exercise;

public class Example07 {
	public static void main(String[] args) {
		int[] array = { -1, -5, -3, -8, -2 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		System.out.println(array[array.length - 1]);
	}
}
