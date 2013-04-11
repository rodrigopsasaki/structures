package br.com.rodrigosasaki.structures.bag;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagTest{
	
	private Bag<Integer> bag;
	
	@Before
	public void setUp(){
		bag = new Bag<Integer>();
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
}
