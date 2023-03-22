package ch18.lecture.p05reader;

import java.io.*;
import java.util.*;

import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.tools.*;
import javax.tools.JavaFileManager.*;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try (var rd = new FileReader(name)) {
			System.out.println((char)rd.read());
			System.out.println((char)rd.read());
			System.out.println((char)rd.read());
			
			char[] data = new char[5];
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			rd.read(data);
			System.out.println(Arrays.toString(data));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
