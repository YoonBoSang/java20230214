package ch15.exercise.exam09;

import java.util.*;
import java.util.Map.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		Set<String> set = map.keySet();
		for (String i : set) {
			totalScore += map.get(i);
			if (maxScore < map.get(i)) {
				maxScore = map.get(i);
				name = i;
			}
		}
		int avg = totalScore / map.size();
//
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			String key = entry.getKey();
//			int val = entry.getValue();
//
//			totalScore += val;
//
//			if (val > maxScore) {
//				name = key;
//				maxScore = val;
//			}
//		}

		System.out.println("평균 점수: " + avg);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
	}
}
