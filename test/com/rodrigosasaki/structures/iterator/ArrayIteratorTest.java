package com.rodrigosasaki.structures.iterator;

import java.util.Iterator;

import org.junit.Test;

import com.rodrigosasaki.structures.iterator.ArrayIterator;

import static org.junit.Assert.*;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayIteratorTest {

	@Test
	public void shouldReturnIteratorWithCorrectItems(){
		Integer[] ints = new Integer[10];
		for(int i = 0 ; i < 10 ; i++){
			ints[i] = i;
		}
		
		Iterator<Integer> ite = new ArrayIterator<Integer>(ints);
		Integer count = 0;
		while(ite.hasNext()){
			assertEquals(count++, ite.next());
		}
	}
}
