package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score 스트림으로 변환
//		studentList.stream()
//			.mapToInt(s -> s.getScore())
//			.forEach(score -> System.out.println(score));
		
		int stream = studentList.stream()
			.mapToInt(s -> s.getScore())
			.max()
			.getAsInt();
		System.out.println("최대값: " + stream);
		
		int stream2 = studentList.stream()
				.mapToInt(s -> s.getScore())
				.min()
				.getAsInt();
		System.out.println("최소값: " + stream2);
		
		int stream3 = studentList.stream()
				.mapToInt(s -> s.getScore())
				.sum();
		System.out.println("합: " + stream3);
		
		double stream4 = studentList.stream()
				.mapToDouble(s -> s.getScore())
				.average()
				.getAsDouble();
		System.out.println("평균: " + stream4);
			
		// 통계
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		
		System.out.println("최대: " + summary.getMax());
		System.out.println("최소: " + summary.getMin());
		System.out.println("합: " + summary.getSum());
		System.out.println("평균: " + summary.getAverage());
	}
}
