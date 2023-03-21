package ch11.lecture.p02try_catch;

public class C05MultipleException {
	public static void main(String[] args) {
		try {
		int[] a = {0 , 1 , 2};
		
		// ArithmeticException
		// ArrayIndexOutOfBoundsException
		int c = 3 / a[0];
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("continue..");
	} 
}
