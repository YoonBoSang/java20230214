package ch04.sec02;

public class IfNestedEample {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 90) {
			if(score >=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}
// 2 3 5 7 11 13 17 19 2329