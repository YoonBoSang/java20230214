package Test;

public class Test59 {
	public static void main(String[] args) {
		int num = 16;
        int answer = 0;
        while(num != 1) {
        	System.out.println(num);
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++;
            if(answer == 500) {
//                return -1;
            	System.out.println(-1);
            }
        }
	}
}
