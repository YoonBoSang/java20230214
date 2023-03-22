package ch18.sec04.exam01;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		try (Writer writer = new FileWriter("output/test.txt")){
			//1 문자씩 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char 배열 출력
			char[] arr = { 'C', 'D', 'E' };
			writer.write(arr);
			
			//문자열 출력
			writer.write("FHG");
			
			//버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
