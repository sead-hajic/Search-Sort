package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import search.BinarySearch;
public class testBinarySearch {
	
	int[] elements;
	
	@BeforeEach
	public void init() {
		elements = new int[] {4,2,7,3,1,8,9,};
	}
	
	@Test
	public void test1() {
		assertEquals(6, BinarySearch.binarySearch(elements, 9));
	}
	
	@Test
	public void test2() {
		assertEquals(1, BinarySearch.binarySearch(elements, 2));
	}
	
}
