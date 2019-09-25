package program;

import java.util.Arrays;

import util.Util;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {12, 23, 3, 5, 12, 43, 6, 0, 3, 9, 10, 21};
		SelectionSortt(array);
		
		System.out.println(Arrays.toString(array));

	}

	private static void SelectionSortt(int[] array) {
		for(int i = 0; i < array.length - 1; i ++) {
			int menor = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[menor] > array[j]) {
					menor = j;
				}
			}Util.swap(array, i, menor);
		}
		
		
	}

}
