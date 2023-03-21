package ch11.lecture.p04throw;

import java.io.*;

public class C08Throw {
	public static void main(String[] args) {
		try {
		method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			method1();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			method1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws FileNotFoundException, ClassNotFoundException{
		
	}
}
