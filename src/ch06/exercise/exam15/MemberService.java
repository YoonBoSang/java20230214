package ch06.exercise.exam15;

public class MemberService {
	boolean login(String var1, String var2) {
		if(var1.equals("hong") && var2.equals("12345")) {
			return true;
		} else {
			return false;
		}
			
	}
	
	void logout(String var1) {
		System.out.println(var1 + "님이 로그아웃 되었습니다.");
	}
}
