package com.rodrigosasaki.structures.sort;

import static com.rodrigosasaki.structures.util.ArrayUtil.less;
import static com.rodrigosasaki.structures.util.ArrayUtil.swap;

import java.util.Comparator;

/**
 * @author Rodrigo Sasaki
 */
public class SelectionSort{
	
	public static <T extends Comparable<T>> void sort(T[] elements){
		for(int i = 0 ; i < elements.length ; i++){
			int smallest = i;
			for(int j = i + 1 ; j < elements.length ; j++){
				if(less(elements[j], elements[smallest])){
					smallest = j;
				}
			}
			swap(elements, i, smallest);
		}
	}
	
	public static <T> void sort(T[] elements, Comparator<T> comparator){
		for(int i = 0 ; i < elements.length ; i++){
			int smallest = i;
			for(int j = i + 1 ; j < elements.length ; j++){
				if(less(comparator, elements[j], elements[smallest])){
					smallest = j;
				}
			}
			swap(elements, i, smallest);
		}
	}
	
}
