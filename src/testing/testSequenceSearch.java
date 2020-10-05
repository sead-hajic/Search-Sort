package testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import search.SequenceSearch;

public class testSequenceSearch {
	
int[] elements;
	
	@BeforeEach
	public void init() {
		elements = new int[] {4,2,7,3,1,8,9,};
	}
	
	@Test
	public void test1() {
		assertEquals(2, SequenceSearch.sequenceSearch(elements, 7));
	}
	
	@Test
	public void test2() {
		assertEquals(6, SequenceSearch.sequenceSearch(elements, 9));
	}
	
}
