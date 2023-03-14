package ch16.exercise.exam06;

public class Example {
	public static double calc(Function fun) {
		double a = 10;
		double b = 4;
		return fun.apply(a, b);
	}

	public static void main(String[] args) {
//		double result = calc( (x, y) -> (x / y));
		double result = calc(new Function() {
			public double apply(double x, double y) {
				return (x / y);
			}
		});
		System.out.println("result: " + result);
	}

	@FunctionalInterface
	public interface Function {
		double apply(double x, double y);
	}
}
