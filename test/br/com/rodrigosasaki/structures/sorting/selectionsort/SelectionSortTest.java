package br.com.rodrigosasaki.structures.sorting.selectionsort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.rodrigosasaki.structures.sorting.selectionsort.SelectionSort;

/**
 * @author Rodrigo Sasaki
 */
public class SelectionSortTest{

	/**
	 * FIXME: Should be implemented with our own utility classes in the future
	 */
	@Test
	public void shouldOrderAShuffledArray(){
		Integer[] numbers = new Integer[10];
		
		numbers[0] = 9;
		numbers[1] = 8;
		numbers[2] = 7;
		numbers[3] = 6;
		numbers[4] = 5;
		numbers[5] = 4;
		numbers[6] = 3;
		numbers[7] = 2;
		numbers[8] = 1;
		numbers[9] = 0;
		
		SelectionSort.sort(numbers);
		
		for(Integer i = 0 ; i < 10 ; i ++){
			assertEquals(i, numbers[i]);
		}
	}
}
