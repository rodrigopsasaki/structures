package com.rodrigosasaki.structures.bag;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rodrigosasaki.structures.bag.ArrayBag;
import com.rodrigosasaki.structures.bag.Bag;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayBagTest{
	
	private Bag<Integer> bag;
	
	@Before
	public void setUp(){
		bag = new ArrayBag<Integer>();
	}

	@Test
	public void shouldAddAnItemAndHaveSize1(){
		bag.add(1);
		assertEquals(1, bag.size());
	}
	
	@Test
	public void shouldAdd11ItemsAndIncreaseSize(){
		for(int i = 0 ; i < 11 ; i++){
			bag.add(i);
		}
		assertEquals(11, bag.size());
	}
	
	@Test
	public void shouldReturnCorrectlyWhenEmpty(){
		assertEquals(true, bag.isEmpty());
		assertEquals(0, bag.size());
	}
}
