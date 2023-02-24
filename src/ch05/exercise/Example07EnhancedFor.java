package ch05.exercise;

public class Example07EnhancedFor {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int n : array) {
			if(n > max) {
				max = n;
			}
		}
		//최대값
		System.out.println(max);
//		최대값이 있는 index
		
	}
}
