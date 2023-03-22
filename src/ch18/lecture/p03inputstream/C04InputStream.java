package ch18.lecture.p03inputstream;

import java.io.*;
import java.util.*;

public class C04InputStream {
	public static void main(String[] args) {
		String name = "output/output6.txt";

		try (var is = new FileInputStream(name)) {
			byte[] arr = new byte[5];

			int len = 0;
			while ((len = is.read(arr)) != -1) {
				System.out.println(Arrays.toString(arr));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
