package Test;

import java.util.*;

public class Test64 {
	public static void main(String[] args) {
		String s = "try   hello  world";
        String answer = "";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(String str : arr) {
        	if(str.equals("")) {
        		continue;
        	}
            if(!str.equals(arr[0])) {
                answer += " ";
            }
            for(int i = 0; i < str.length(); i++) {
                if((i + 1) % 2 != 0) {
                    answer += str.substring(i, i+1).toUpperCase();
                } else {
                    answer += str.substring(i, i+1);   
                }
            }
            System.out.println(answer);
        }
	}
}
