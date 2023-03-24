package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C06Server {
	public static void main(String[] args) {
		C05Client o1 = new C05Client();
		int port = 50500;
		boolean run = true;
		o1.setInput("");

		try (ServerSocket serverSocket = new ServerSocket(port);) {
			while (run) {
				System.out.println("연결 기다리는중.....");
				Socket socket = serverSocket.accept();
				Thread t = new Thread(() -> {
					try (
							InputStream is = socket.getInputStream();
							BufferedInputStream bis = new BufferedInputStream(is);
							InputStreamReader isr = new InputStreamReader(bis);) {

						char[] data = new char[1024];
						int len = 0;
						System.out.println("입력 받는중.....");
						while ((len = isr.read(data)) != -1) {
							o1.setInput(new String(data, 0, len));
							System.out.println(o1.getInput());
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

				});
				t.start();
				t.join();
				if(o1.getInput().equals("종료")) {
					run = false;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}
}
