package ch05.lecture.p02reference;

public class C04rReference {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
		
		method1(arr1);
		
		System.out.println(arr1[0]);
	}
	
	public static void method1(int[] arr2) {
		System.out.println(arr2[0]);
		arr2[0] = 30;
		System.out.println(arr2[0]);
	}
}
