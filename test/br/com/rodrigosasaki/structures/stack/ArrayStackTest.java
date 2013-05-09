package br.com.rodrigosasaki.structures.stack;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.Iterator;

import org.junit.Test;

import com.rodrigosasaki.structures.stack.ArrayStack;
import com.rodrigosasaki.structures.stack.Stack;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayStackTest{

	@Test
	public void shouldPopItemsInCorrectOrder(){
		Stack<Integer> stack = new ArrayStack<Integer>();

		for (Integer i = 1; i <= 5; i++){
			stack.push(i);
		}

		for (Integer i = 5; i >= 1; i--){
			assertEquals(i, stack.pop());
		}
	}

	@Test
	public void shouldDoubleWhenLimitExceeded(){
		Stack<Integer> stack = new ArrayStack<Integer>();

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
			Stack<Integer> stack = new ArrayStack<Integer>();
			Field elements = stack.getClass().getDeclaredField("elements");
			elements.setAccessible(true);

			for (Integer i = 1; i <= 15; i++){
				stack.push(i);
				Object[] internalArray = (Object[]) elements.get(stack);
				if (i <= 10){
					assertEquals(10, internalArray.length);
				} else{
					assertEquals(20, internalArray.length);
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void shouldReturnIteratorThatInteratesInInsertionOrder(){
		Stack<Integer> stack = new ArrayStack<Integer>();

		for (Integer i = 1; i <= 15; i++){
			stack.push(i);
		}

		assertEquals(15, stack.size());

		Integer count = 1;

		for (Integer n : stack){
			assertEquals(count++, n);
		}
		
		assertEquals(Integer.valueOf(16), count);
	}

	@Test
	public void shouldReturnEmptyIteratorWhenEmpty(){
		Stack<Integer> stack = new ArrayStack<Integer>();
		Iterator<Integer> ite = stack.iterator();
		assertEquals(false, ite.hasNext());
	}

	@Test
	public void shouldReturnTrueForIsEmptyWhenEmptied(){
		Stack<Integer> stack = new ArrayStack<Integer>();

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

	@Test
	public void shouldPopCorrectValueAndDecreaseSize(){
		Stack<Integer> stack = new ArrayStack<Integer>();

		stack.push(1);
		stack.push(2);

		assertEquals(2, stack.size());

		Integer result = stack.pop();

		assertEquals(Integer.valueOf(2), result);
		assertEquals(1, stack.size());
	}

	@Test
	public void shouldPeekCorrectValueAndMaintainSize(){
		Stack<Integer> stack = new ArrayStack<Integer>();

		stack.push(1);
		stack.push(2);

		assertEquals(2, stack.size());

		Integer result = stack.peek();

		assertEquals(Integer.valueOf(2), result);
		assertEquals(2, stack.size());
	}

}
