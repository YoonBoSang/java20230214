package ch15.exercise.exam0508;

import java.util.*;

public class Exam0508 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88)
				);
				
		// 문제 6
		System.out.println(list.size());
		System.out.println(list.get(2).size());
		
		// 문제 8
		// 합, 평균 구하기
		for(List<Integer> i : list) {
			for(int num : i) {
				sum += num;
			}
			cnt += i.size();
		}
		avg = (double)sum/cnt;
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
	}
}
