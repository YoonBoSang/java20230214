package ch15.exercise.exam10;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
//		Student student1 = new Student("blue", 96);
//		Student student2 = new Student("hong", 86);
//		treeSet.add(student1);
//		treeSet.add(student2);
		
//		student1.compareTo(student2);
		
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		Student student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}
}
