package search;

public class BinarySearch {
	
	public static int binarySearch(int[] elements, int searchEleement) {
		int lo = 0;
		int hi = elements.length - 1;
		
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(searchEleement < elements[mid])
				hi = mid - 1;
			else if (searchEleement > elements[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(BinarySearch.binarySearch(new int[] {11,12,13,14,15,16,17,18}, 13));
	}
	
}
