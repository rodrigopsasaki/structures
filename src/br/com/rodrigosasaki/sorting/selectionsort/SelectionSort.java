package br.com.rodrigosasaki.sorting.selectionsort;

/**
 * @author Rodrigo Sasaki
 */
public class SelectionSort{
	
	public static <T extends Comparable<T>> void sort(T[] elements){
		for(int i = 0 ; i < elements.length ; i++){
			int smallset = i;
			for(int j = i + 1 ; j < elements.length ; j++){
				if(less(elements[j], elements[j - 1])){
					smallset = j;
				}
			}
			exchange(elements, i, smallset);
		}
	}
	
	public static <T extends Comparable<T>> void exchange(T[] elements, int one, int other){
		T swap = elements[one];
		elements[one] = elements[other];
		elements[other] = swap;
	}
	
	public static <T extends Comparable<T>> boolean less(T one, T other){
		return one.compareTo(other) < 0;
	}

}
