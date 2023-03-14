package ch16.exercise.exam08;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93),
	};
//	Function<Double> function = new Function<>(t) {
//		public double apply(t) {
//			
//		}
//	};
	//avg() 메소드 작성
	private static double avg(Function<? super Student> function) {
		double sum = 0;
		for (Student s : students) {
			double score = function.apply(s);
			sum += score;
		}
		return sum / students.length;
	}
	public static void main(String[] args) {
//		double englishAvg = avg( s -> s.getEnglishScore() );
		double englishAvg = avg(new Function<Student>() {
			public double apply(Student s) {
				return s.getEnglishScore();
			}
		});
		
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
