package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy" };
		//길이 5인 배열
		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열 항목 출력
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		String[] arr1 = Arrays.copyOf(oldStrArray, 3);
		System.out.print(arr1[0] + ", ");
		System.out.print(arr1[1] + ", ");
		System.out.print(arr1[2]);
		
	}
}
