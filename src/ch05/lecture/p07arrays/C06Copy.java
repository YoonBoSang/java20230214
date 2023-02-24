package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C06Copy {
	public static void main(String[] args) {
		int[][] arr1 = {
				{3, 4},
				{9, 8}
		};
		
		// 얕은 복사 (shallo copy)
		int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		arr1[0][0] = 30;
		
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		str1 = "aa";
		
		System.out.println(str2);
		
	}
}
