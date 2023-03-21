package ch11.lecture.p04throw;

import java.io.*;

public class C09Throw {
	public static void main(String[] args) {
		try {
		method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws Exception{
		boolean a = true;
		if (a) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
}
