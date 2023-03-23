package ch14.exercise.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();

		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("메인 쓰레드!!");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MusicRunnable extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}