package br.com.rodrigosasaki.structures.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.rodrigosasaki.structures.shuffle.FisherYatesShuffle;

/**
 * @author Rodrigo Sasaki
 */
public class MergeSortTest{

	@Test
	public void shouldOrderAShuffledArray(){
		int size = 10;
		Integer[] numbers = new Integer[size];

		for (Integer i = 0; i < numbers.length; i++){
			numbers[i] = i;
		}

		FisherYatesShuffle.shuffle(numbers);
		MergeSort.sort(numbers);
		
		for (Integer i = 0; i < numbers.length; i++){
			assertEquals(i, numbers[i]);
		}
	}
}
