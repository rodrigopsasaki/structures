package com.rodrigosasaki.structures.sort;

import static com.rodrigosasaki.structures.util.ArrayUtil.less;

import java.util.Comparator;

/**
 * @author Rodrigo Sasaki This class was originally written with a simpler
 *         version. But I changed it to use the optimized version presented in
 *         class
 */
public class MergeSort{

	private static int INSERTION_CUT = 7;
	
	public static <T extends Comparable<T>>void sort(T[] elements){
		T[] aux = elements.clone();
		sort(aux, elements, 0, elements.length - 1);
	}
	
	private static <T extends Comparable<T>>void sort(T[] src, T[] dst, int lo, int hi){
		if (hi <= lo + INSERTION_CUT){
			InsertionSort.sort(dst, lo, hi + 1);
			return;
		}
		
		int mid = lo + (hi - lo) / 2;
		sort(dst, src, lo, mid);
		sort(dst, src, mid + 1, hi);
		
		if (!less(src[mid + 1], src[mid])){
			System.arraycopy(src, lo, dst, lo, hi - lo + 1);
			return;
		}
		
		merge(src, dst, lo, mid, hi);
	}
	
	private static <T extends Comparable<T>>void merge(T[] src, T[] dst, int lo, int mid, int hi){
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++){
			if (i > mid)
				dst[k] = src[j++];
			else if (j > hi)
				dst[k] = src[i++];
			else if (less(src[j], src[i]))
				dst[k] = src[j++];
			else
				dst[k] = src[i++];
		}
	}

	public static <T>void sort(T[] elements, Comparator<T> comparator){
		T[] aux = elements.clone();
		sort(aux, elements, 0, elements.length - 1, comparator);
	}

	private static <T>void sort(T[] src, T[] dst, int lo, int hi, Comparator<T> comparator){
		if (hi <= lo + INSERTION_CUT){
			InsertionSort.sort(dst, lo, hi + 1, comparator);
			return;
		}

		int mid = lo + (hi - lo) / 2;
		sort(dst, src, lo, mid, comparator);
		sort(dst, src, mid + 1, hi, comparator);

		if (!less(comparator, src[mid + 1], src[mid])){
			System.arraycopy(src, lo, dst, lo, hi - lo + 1);
			return;
		}

		merge(src, dst, lo, mid, hi, comparator);
	}

	private static <T>void merge(T[] src, T[] dst, int lo, int mid, int hi, Comparator<T> comparator){
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++){
			if (i > mid)
				dst[k] = src[j++];
			else if (j > hi)
				dst[k] = src[i++];
			else if (less(comparator, src[j], src[i]))
				dst[k] = src[j++];
			else
				dst[k] = src[i++];
		}
	}

}
