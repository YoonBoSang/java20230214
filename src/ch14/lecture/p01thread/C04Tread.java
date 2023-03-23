package ch14.lecture.p01thread;

public class C04Tread {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			while (true) {
				System.out.println("## 쓰레드 실행중 ##");
			}
		});
		
		t1.start();
		
		while (true) {
			System.out.println("@@@@@MainTread Running@@@@@");
		}
	}
}
