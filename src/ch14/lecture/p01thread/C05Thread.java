package ch14.lecture.p01thread;

public class C05Thread {
	public static void main(String[] args) {
		Thread t1 = new MyThread05();
		t1.start();
		
		while(true) {
			System.out.println("@@@@@@@@Main Thread@@@@@@@@");
		}
	}
}

// Thread 만드는 두번째 방법
// Thread 클래스 상속
// run 메소드 재정의

class MyThread05 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("###Thread Running###");
		}
	}
}