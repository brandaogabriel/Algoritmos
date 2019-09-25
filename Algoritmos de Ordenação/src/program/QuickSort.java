package program;

import java.util.Arrays;

import util.Util;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {5, 1, 7, 9, 6};
		QuickSortt(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));

	}

	private static void QuickSortt(int[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
		int posicaoPivot = partition(array, leftIndex, rightIndex);
		QuickSortt(array, leftIndex, posicaoPivot - 1);
		QuickSortt(array, posicaoPivot + 1, rightIndex);
		}
	}

	private static int partition(int[] array, int leftIndex, int rightIndex) {
		int pivot = array[leftIndex];
		int start = leftIndex;
		
		for(int j = start + 1; j <= rightIndex; j++) {
			if(array[j] <= pivot) {
				start +=1;
				Util.swap(array, start, j);
			}
		}
		Util.swap(array, leftIndex, start); //Ultima troca que eh feita, o pivor com o ultimo menor elemento
		
		return start;
	}

}
