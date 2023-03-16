package codetest.leetcode;

import java.util.*;

public class Solution2206 {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : nums) {

			// 각 값이 몇개인지 확인하는 코드
			if (map.containsKey(n)) {
				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
				int oldvalue = map.get(n);
				map.put(n, oldvalue + 1);
			} else {
				map.put(n, 1);
			}
		}

		// value가 홀수 인게 있으면 return false
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();
			if (v % 2 == 1) {
				return false;
			} else {
				return true;
			}
		}
		
		return true;
	}
}
