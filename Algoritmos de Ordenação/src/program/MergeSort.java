package program;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {5, 1, 7, 9, 6};
		MergeSortt(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));

	}

	private static void MergeSortt(int[] array, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			MergeSortt(array, inicio, meio);
			MergeSortt(array, meio + 1, fim);
			Merge(array, inicio, meio, fim);
		}
		
	}

	private static void Merge(int[] array, int inicio, int meio, int fim) {
		int[] aux = new int[array.length];
		
//		preenchendo o vetor auxiliar com os valores do array
		for(int i = inicio; i <= fim; i++)
			aux[i] = array[i];
		
//		Anda na primeira metade do vetor
		int i = inicio;
		
//		Anda na segunda metade do vetor
		int j = meio + 1;
		
		for(int k = inicio; k <= fim; k++) {
//			Se a primeira metade do vetor ja terminou
			if(i > meio)
				array[k] = aux[j++];
			
//			Se a segunda metade do vetor ja terminou
			else if(j > fim)
				array[k] = aux[i++];
			
//			Se ainda tem elementos na primeira metade e segunda metade
			else if(aux[i] < aux[j])
				array[k] = aux[i++];
			else array[k] = aux[j++];
			
		}
		
	}

}
