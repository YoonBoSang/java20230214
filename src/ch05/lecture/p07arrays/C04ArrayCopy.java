package ch05.lecture.p07arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		//책 188쪽
		int[] origin = {9, 8, 1, 2, 3};
		int[] target = new int[origin.length];
		
		System.arraycopy(origin, 0, target, 0, origin.length);
	}
}
