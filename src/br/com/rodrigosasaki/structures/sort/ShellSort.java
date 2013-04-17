package br.com.rodrigosasaki.structures.sort;

/**
 * @author Rodrigo Sasaki
 */
public class ShellSort{
	
	public static <T extends Comparable<T>> void sort(T[] elements){
		int h = findH(elements.length);
		while(h > 0){
			InsertionSort.hsort(elements, h);
			h = knuthDecrement(h);
		}
	}
	
	private static int findH(int length){
		int h = 1;
		
		while(h < length){
			h = knuthIncrement(h);
		}
		
		return knuthDecrement(h);
	}

	private static int knuthIncrement(int h){
		return h * 3 + 1;
	}
	
	private static int knuthDecrement(int h){
		return h / 3;
	}

}
