package Test;

public class Test65 {
	public static void main(String[] args) {
		String s = 	"abab    AAA    AccC      ";
		String[] arr = s.split("");
		System.out.println(arr[0]);
		System.out.println(arr[8].equals(" "));
	}
}
