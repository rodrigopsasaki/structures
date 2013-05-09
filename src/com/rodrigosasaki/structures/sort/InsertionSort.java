package com.rodrigosasaki.structures.sort;

import static com.rodrigosasaki.structures.util.ArrayUtil.less;
import static com.rodrigosasaki.structures.util.ArrayUtil.swap;

import java.util.Comparator;

/**
 * @author Rodrigo Sasaki
 */
public class InsertionSort{

	public static <T extends Comparable<T>>void sort(T[] elements){
		hsort(elements, 1);
	}

	protected static <T extends Comparable<T>>void sort(T[] elements, int from, int to){
		hsort(elements, 1, from, to);
	}

	protected static <T extends Comparable<T>>void hsort(T[] elements, int h){
		hsort(elements, h, 0, elements.length);
	}

	protected static <T extends Comparable<T>>void hsort(T[] elements, int h, int from, int to){
		for (int i = from; i < to; i++){
			for (int j = i; (j > from) && (j >= h) && less(elements[j], elements[j - h]); j -= h){
				swap(elements, j, j - h);
			}
		}
	}

	public static <T>void sort(T[] elements, Comparator<T> comparator){
		hsort(elements, 1, comparator);
	}

	protected static <T>void sort(T[] elements, int from, int to, Comparator<T> comparator){
		hsort(elements, 1, from, to, comparator);
	}

	protected static <T>void hsort(T[] elements, int h, Comparator<T> comparator){
		hsort(elements, h, 0, elements.length, comparator);
	}

	protected static <T>void hsort(T[] elements, int h, int from, int to, Comparator<T> comparator){
		for (int i = from; i < to; i++){
			for (int j = i; (j > from) && (j >= h) && less(comparator, elements[j], elements[j - h]); j -= h){
				swap(elements, j, j - h);
			}
		}
	}

}
