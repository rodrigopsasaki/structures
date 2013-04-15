package br.com.rodrigosasaki.structures.sort;

import static br.com.rodrigosasaki.strucutres.util.StructuresUtil.*;

/**
 * @author Rodrigo Sasaki
 */
public class SelectionSort{
	
	public static <T extends Comparable<T>> void sort(T[] elements){
		for(int i = 0 ; i < elements.length ; i++){
			int smallest = i;
			for(int j = i + 1 ; j < elements.length ; j++){
				if(elements[j].compareTo(elements[smallest]) < 0){
					smallest = j;
				}
			}
			swap(elements, i, smallest);
		}
	}
	
}
