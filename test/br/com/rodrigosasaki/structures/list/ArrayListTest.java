package br.com.rodrigosasaki.structures.list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayListTest{

	@Test
	public void shouldCorrectlyAdd1Item(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(35);
		assertEquals(Integer.valueOf(35), list.get(0));
	}

	@Test
	public void shouldRemoveCorrectItem(){
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i = 0; i < 10; i++){
			list.add(i);
		}

		Integer removedItem = list.remove(7);

		assertThat(removedItem, not(equalTo(list.get(7))));
		assertEquals(Integer.valueOf(8), list.get(7));
	}

	@Test
	public void shouldIterateCorrectlyOnForeach(){
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i = 0; i < 10; i++){
			list.add(i);
		}
		
		int count = 0;
		for(Integer num : list){
			assertEquals(list.get(count++), num);
		}
	}
	
	@Test
	public void shouldRemoveAndAdaptSize(){
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i = 0; i < 10; i++){
			list.add(i);
		}
		
		assertEquals(10, list.size());
		list.remove(0);
		assertEquals(9, list.size());
	}
	
	@Test
	public void shouldGrowWhenExceededArray(){
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i = 0; i < 100; i++){
			list.add(i);
		}
		
		for (Integer i = 0; i < 100; i++){
			assertEquals(i, list.get(i));
		}
	}

}
