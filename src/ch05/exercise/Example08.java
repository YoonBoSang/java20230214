package ch05.exercise;

public class Example08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int len = 0;
		for(int i = 0; i < array.length; i++) {
			len += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
//				len++;
			}
		}
		System.out.println("배열의 총합: " + sum);
		System.out.println("배열의 평균: " + sum/(double)len);
		
	}
}
