package codetest.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] num1,int[] num2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int n : num1) {
			set1.add(n);
		}
		for(int n : num2) {
			set2.add(n);
		}
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(set2::contains);
		list2.removeIf(set1::contains);
		return List.of(list1,list2);
	}
}
