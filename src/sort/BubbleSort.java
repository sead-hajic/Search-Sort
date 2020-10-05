package sort;

public class BubbleSort {
	public static int[] sort(int[] elements) {
		for(int i = 0; i < elements.length; i ++) {
			for(int j = 1; j < elements.length - i;  j ++) {
				if(elements[j - 1] < elements[j]) {
					int temp = elements[j - 1];
					elements[j - 1] = elements[j];
					elements[j] = temp;
				}
			}
		}
		return elements;
	}
	
	public static void main(String[] args) {
		int elements[] = {5,4,3,2,1};
		int arr[] = BubbleSort.sort(elements);
		for(int i = 0; i < arr.length; i ++)
			System.out.print(arr[i] + " ");
	}
}
