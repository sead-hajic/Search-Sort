package testing;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sort.BubbleSort;

public class testBubbleSort {
int[] elements;
	
	@BeforeEach
	public void init() {
		elements = new int[] {4,2,5,3,1,7,6};
	}
	
	@Test
	public void test1() {
		int[] actual = BubbleSort.sort(elements);
		assertEquals(1, actual[6]);
	}
	
	@Test
	public void test2() {
		int[] actual = BubbleSort.sort(elements);
		assertEquals(3, actual[4]);
	}
	
}
