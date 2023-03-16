package ch15.lecture.p07treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3, 1, 20, 3000, 15, 7, 9, 2, 2500, 100));
		
		System.out.println(set);
		
		// first
		System.out.println(set.first());
		
		// last
		System.out.println(set.last());
		
		// lower
		System.out.println("lower");
		System.out.println(set.lower(50));
		System.out.println(set.lower(20));
		System.out.println();
		
		// higher
		System.out.println("higher");
		System.out.println(set.higher(50));
		System.out.println(set.higher(100));
		System.out.println();
		
		// floor
		System.out.println("floor");
		System.out.println(set.floor(20));
		System.out.println(set.floor(50));
		System.out.println();
		
		// ceiling
		System.out.println("ceiling");
		System.out.println(set.ceiling(50));
		System.out.println(set.ceiling(100));
		System.out.println();
		
		// 거꾸로 정렬된 NavigableSet 리턴
		System.out.println("descendingSet()");
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
		System.out.println();
	}
}
