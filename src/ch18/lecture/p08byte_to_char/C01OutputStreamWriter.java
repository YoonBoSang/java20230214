package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws Exception{
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		osw.write('a');
		osw.write('b');
		osw.write('한');
		
		osw.close();
	}
	
	public static OutputStream getOutput(String fileName) throws Exception {
		OutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
