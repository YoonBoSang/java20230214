package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		// ip주소
		String ip = "172.30.1.12";

		// port 번호
		int port = 50500;

		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);) {

			ps.print("""
					신비로운 너의모습 나에게도 사랑인↘걸↗ 조금씩 멈춰지는 시↗간→속↗에 널↗
					어↗둠속에 빛처럼~ My↗ Love 나를 기다리는 너의
					""");

			ps.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 종료");

	}
}
