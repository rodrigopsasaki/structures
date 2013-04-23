package br.com.rodrigosasaki.structures.sort;

import static br.com.rodrigosasaki.structures.util.ArrayUtil.*;

/**
 * @author Rodrigo Sasaki
 */
public class MergeSort{
	
	private static int INSERTION_CUT = 7;

	public static <T extends Comparable<T>> void sort(T[] elements){
		T[] aux = elements.clone();
		sort(aux, elements, 0, elements.length - 1);
	}

	private static <T extends Comparable<T>> void sort(T[] src, T[] dst, int lo, int hi){
		if (hi <= lo + INSERTION_CUT){
			InsertionSort.sort(dst, lo, hi + 1);
			return;
		}

		int mid = lo + (hi - lo) / 2;
		sort(dst, src, lo, mid);
		sort(dst, src, mid + 1, hi);
		
		if (!less(src[mid + 1],src[mid])){
			System.arraycopy(src, lo, dst, lo, hi - lo + 1);
			return;
		}
		
		merge(src, dst, lo, mid, hi);
	}

	private static <T extends Comparable<T>> void merge(T[] src, T[] dst, int lo, int mid, int hi){
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++){
			if      (i > mid) 			   dst[k] = src[j++];
			else if (j > hi)			   dst[k] = src[i++];
			else if (less(src[j], src[i])) dst[k] = src[j++];
			else				           dst[k] = src[i++];
		}
	}
	


}
