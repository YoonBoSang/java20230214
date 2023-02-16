package ch03.exercise;

public class Example05 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height / 2.0);
		double area1 = (lengthTop + lengthBottom) * height * 1.0 / 2;
		double area2 = (double)(lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		System.out.println(area1);
		System.out.println(area2);
		
		
		
	}
}
