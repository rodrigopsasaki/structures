package br.com.rodrigosasaki.structures.sort;

/**
 * @author Rodrigo Sasaki
 */
public class MergeSort {
	
	@SuppressWarnings("unchecked")
	public static <E> void sort(Comparable<E>[] elements){
		int length = elements.length;
		Comparable<E>[] aux = new Comparable[length];
		for(int size = 0 ; size < length ; size += size){
			for(int lo = 0 ; lo < length - size ; size += size + size){
				merge(elements, lo, lo + size - 1, Math.min(lo + size + size - 1, length - 1));
			}
		}
	}
	
	private static <E> void merge(Comparable<E>[] a, int lo, int mid, int hi){
		
	}
	
	

}
