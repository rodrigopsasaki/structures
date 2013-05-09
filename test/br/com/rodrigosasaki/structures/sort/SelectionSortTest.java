package br.com.rodrigosasaki.structures.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rodrigosasaki.structures.comparators.IntegerComparator;
import com.rodrigosasaki.structures.shuffle.FisherYatesShuffle;
import com.rodrigosasaki.structures.sort.SelectionSort;


/**
 * @author Rodrigo Sasaki
 */
public class SelectionSortTest{
	
	@Test
	public void shouldOrderAShuffledArray(){
		Integer[] numbers = new Integer[10];
		
		for (Integer i = 0; i < numbers.length; i++){
			numbers[i] = i;
		}
		
		FisherYatesShuffle.shuffle(numbers);
		SelectionSort.sort(numbers);
		
		for (Integer i = 0; i < 10; i++){
			assertEquals(i, numbers[i]);
		}
	}

	@Test
	public void shouldOrderAShuffledArrayUsingComparator(){
		Integer[] numbers = new Integer[10];

		for (Integer i = 0; i < numbers.length; i++){
			numbers[i] = i;
		}

		FisherYatesShuffle.shuffle(numbers);
		SelectionSort.sort(numbers, new IntegerComparator());
		
		for (Integer i = 0; i < 10; i++){
			assertEquals(i, numbers[i]);
		}
	}
}
