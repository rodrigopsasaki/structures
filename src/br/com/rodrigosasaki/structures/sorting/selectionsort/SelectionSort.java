package br.com.rodrigosasaki.structures.sorting.selectionsort;

/**
 * @author Rodrigo Sasaki
 */
public class SelectionSort{
	
	public static <T extends Comparable<T>> void sort(T[] elements){
		for(int i = 0 ; i < elements.length ; i++){
			int smallest = i;
			for(int j = i + 1 ; j < elements.length ; j++){
				if(elements[j].compareTo(elements[j - 1]) < 0){
					smallest = j;
				}
			}
			swap(elements, i, smallest);
		}
	}
	
	public static <T extends Comparable<T>> void swap(T[] elements, int one, int other){
		T t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}
	
}
