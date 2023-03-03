package Test;

public class Test33 {
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		String str1 = "";
		String[] arr = my_string.split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j].matches("[0-9]")) {
					if (j > 0) {
						if (arr[j + 1].matches("[0-9]") || arr[j - 1].matches("[0-9]")) {
							str1 += arr[j];
						}
					} else if (j == 0) {
						if (arr[j +1].matches("[0-9]")) {
							str1 += arr[j];
						}
					}
				}
			}
			answer += Integer.parseInt(str1);
			str1 = "";
		}
	}
}
