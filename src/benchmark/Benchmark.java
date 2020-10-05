/* 
 * Binary search is much faster than sequence search even on array that is not sorted
 * Bubble sort algorithm sorts relatively fast smaller arrays(100k arrays), while for larger ones(1 million +)
 * 	it takes a lot of time and also takes a lot of CPU-s processing power.
 */
package benchmark;

import java.util.Random;

import search.BinarySearch;
import search.SequenceSearch;
import sort.BubbleSort;

public class Benchmark {
	
	public static void sequenceSearchTime(int[] elements) {
		long start = System.currentTimeMillis();
		SequenceSearch.sequenceSearch(elements, 213);
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Sequnce search time: " + timeElapsed);
	}
	
	public static void binarySearchTime(int[] elements) {
		long start = System.currentTimeMillis();
		BinarySearch.binarySearch(elements, 3123);
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Binary search time: " +timeElapsed);
	}
	
	public static void bubbleSortTime(int [] elements) {
		long start = System.currentTimeMillis();
		BubbleSort.sort(elements);
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Bubble sort time time: " +timeElapsed);
	}
	
	public static void main(String[] args) {
		int elements1k[] = new int[1000];
		int elements10k[] = new int[10000];
		int elements100k[] = new int[100000];
		int elements1m[] = new int[1000000];
		Random rand = new Random();
		for(int i = 0; i < elements1k.length; i ++) {
			elements1k[i] = rand.nextInt();
		}
		for(int i = 0; i < elements10k.length; i ++) {
			elements10k[i] = rand.nextInt();
		}
		for(int i = 0; i < elements100k.length; i ++) {
			elements100k[i] = rand.nextInt();
		}
		for(int i = 0; i < elements1m.length; i ++) {
			elements1m[i] = rand.nextInt();
		}
		// test sequence search
		System.out.println("1 000 elements");
		sequenceSearchTime(elements1k);
		sequenceSearchTime(elements1k);
		binarySearchTime(elements1k);
		binarySearchTime(elements1k);
		System.out.println("10 000 elements");
		sequenceSearchTime(elements10k);
		sequenceSearchTime(elements10k);
		binarySearchTime(elements10k);
		binarySearchTime(elements10k);
		System.out.println("100 000 elements");
		sequenceSearchTime(elements100k);
		sequenceSearchTime(elements100k);
		binarySearchTime(elements100k);
		binarySearchTime(elements100k);
		System.out.println("1 000 000 elements");
		sequenceSearchTime(elements1m);
		sequenceSearchTime(elements1m);
		binarySearchTime(elements1m);
		binarySearchTime(elements1m);
		
		// sort all previous arrays
		System.out.println("____________________\nBubble sort");
		System.out.println("1 000 elements");
		bubbleSortTime(elements1k);
		bubbleSortTime(elements1k);
		System.out.println("10 000 elements");
		bubbleSortTime(elements10k);
		bubbleSortTime(elements10k);
		System.out.println("100 000 elements");
		bubbleSortTime(elements100k);
		bubbleSortTime(elements100k);
		System.out.println("1 000 000 elements");
		bubbleSortTime(elements1m);
	}
}
