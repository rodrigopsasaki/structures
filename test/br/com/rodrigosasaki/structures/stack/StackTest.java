package br.com.rodrigosasaki.structures.stack;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.Iterator;

import org.junit.Test;

/**
 * @author Rodrigo Sasaki
 */
public class StackTest{

	@Test
	public void shouldPopItemsInCorrectOrder(){
		Stack<Integer> stack = new Stack<Integer>();

		for (Integer i = 1; i <= 5; i++){
			stack.push(i);
		}

		for (Integer i = 5; i >= 1; i--){
			assertEquals(i, stack.pop());
		}
	}

	@Test
	public void shouldDoubleWhenLimitExceeded(){
		Stack<Integer> stack = new Stack<Integer>();

		for (Integer i = 1; i <= 15; i++){
			stack.push(i);
		}

		assertEquals(15, stack.size());

		for (Integer i = 15; i >= 1; i--){
			assertEquals(i, stack.pop());
		}
	}
	
	@Test
	public void internalArrayShouldGrowCorrectly(){
		try{
			Stack<Integer> stack = new Stack<Integer>();
			Field elements = stack.getClass().getDeclaredField("elements");
			elements.setAccessible(true);
			
			for (Integer i = 1; i <= 15; i++){
				stack.push(i);
				Object[] internalArray = (Object[]) elements.get(stack);
				if(i <= 10){
					assertEquals(10, internalArray.length);
				}else{
					assertEquals(20, internalArray.length);
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void shouldReturnIteratorThatInteratesInInsertionOrder(){
		Stack<Integer> stack = new Stack<Integer>();

		for (Integer i = 1; i <= 15; i++){
			stack.push(i);
		}

		assertEquals(15, stack.size());

		Integer count = 1;
		
		for(Integer n : stack){
			assertEquals(count++ , n);
		}
	}
	
	@Test
	public void shouldReturnEmptyIteratorWhenEmpty(){
		Stack<Integer> stack = new Stack<Integer>();
		Iterator<Integer> ite = stack.iterator();
		assertEquals(false, ite.hasNext());
	}
	
	@Test
	public void shouldReturnTrueForIsEmptyWhenEmptied(){
		Stack<Integer> stack = new Stack<Integer>();
		
		for (Integer i = 0; i < 5; i++){
			stack.push(i);
		}
		
		assertEquals(5, stack.size());

		for (Integer i = 0; i < 5; i++){
			stack.pop();
		}
		
		assertEquals(0, stack.size());
		assertEquals(true, stack.isEmpty());
	}

}
