package ch05.exercise;

public class Example08EhhancedFor {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}};
				for(int[] brray : array) {
					for(int n : brray) {
						sum += n;
						cnt++;
				}
		}
				avg = (double) sum / cnt;
				
				System.out.println("합: " + sum);
				System.out.println("평균: " + avg);
				
		}
	}
