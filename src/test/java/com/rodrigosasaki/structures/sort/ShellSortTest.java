package com.rodrigosasaki.structures.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rodrigosasaki.structures.comparators.IntegerComparator;
import com.rodrigosasaki.structures.shuffle.FisherYatesShuffle;
import com.rodrigosasaki.structures.sort.ShellSort;


/**
 * @author Rodrigo Sasaki
 */
public class ShellSortTest{
	
	@Test
	public void shouldOrderAShuffledArray(){
		int size = 10;
		Integer[] numbers = new Integer[size];
		
		for (Integer i = 0; i < numbers.length; i++){
			numbers[i] = i;
		}
		
		FisherYatesShuffle.shuffle(numbers);
		ShellSort.sort(numbers);
		
		for (Integer i = 0; i < size; i++){
			assertEquals(i, numbers[i]);
		}
	}
	
	@Test
	public void shouldOrderAShuffledArrayUsingComparator(){
		int size = 10;
		Integer[] numbers = new Integer[size];

		for (Integer i = 0; i < numbers.length; i++){
			numbers[i] = i;
		}

		FisherYatesShuffle.shuffle(numbers);
		ShellSort.sort(numbers, new IntegerComparator());
		
		for (Integer i = 0; i < size; i++){
			assertEquals(i, numbers[i]);
		}
	}

}
