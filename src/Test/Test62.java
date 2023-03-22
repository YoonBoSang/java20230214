package Test;

import java.util.*;

public class Test62 {
	public static void main(String[] args) {
		String a = "afhaethnf";
		String[] A = a.split("");
		Arrays.parallelSort(A);
		System.out.println(Arrays.toString(A));
	}
	
}
