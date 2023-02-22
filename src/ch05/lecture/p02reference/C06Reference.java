package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6};
		
		method1(arr);
		
		System.out.println(arr[0]);
	}
	public static void method1(int[] arr) {
		arr = new int[] {1, 12, 13};
	}
}
