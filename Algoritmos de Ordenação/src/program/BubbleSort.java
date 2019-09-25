package program;

import java.util.Arrays;

import util.Util;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {12, 23, 3, 5, 12, 43, 6, 0, 3, 9, 10, 21};
		BubbleSortt(array);
		
		System.out.println(Arrays.toString(array));

	}

	private static void BubbleSortt(int[] array) {
		boolean trocou = true;
		
		while(trocou) {
			trocou = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i + 1]) {
					Util.swap(array, i, i + 1);
					trocou = true;
				}
			}
		}
	}

}
