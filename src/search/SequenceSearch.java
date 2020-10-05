package search;

public class SequenceSearch {
	
	public static int sequenceSearch(int[] elements, int searchElement) {
		for(int i = 0; i < elements.length; i ++) {
			if(elements[i] == searchElement) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(SequenceSearch.sequenceSearch(new int[] {3,4,5,1,2,7,20,10,9}, 4));
	}
	
}
