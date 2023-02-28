package codetest.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Test {
	
	@Test
	void bigDiffTest() {
		Array2 o1 = new Array2();
		int res1 = o1.bigDiff(new int[] {10, 3, 5, 7});
		assertEquals(7, res1);
		
		assertEquals(8, o1.bigDiff(new int[] {7, 2, 10, 9}));
	}

	@Test
	void fizzArray3test() {
		Array2 o1 = new Array2();
		int[] res1 = o1.fizzArray3(5, 10);
		
		assertArrayEquals(new int[] {5, 6, 7, 8, 9}, res1);
		
		int[] res2 = o1.fizzArray3(11, 18);
		assertArrayEquals(new int[] {11, 12, 13, 14, 15 ,16, 17}, res2);
	}

}
