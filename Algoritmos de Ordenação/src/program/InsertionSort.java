package program;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {12, 23, 3, 5, 12, 43, 6, 0, 3, 9, 10, 21};
		InsertionSortt(array);
		
		System.out.println(Arrays.toString(array));

	}

	private static void InsertionSortt(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int elemento = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > elemento) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = elemento;
		}
	}

}
