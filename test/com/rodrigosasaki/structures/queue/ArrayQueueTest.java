package com.rodrigosasaki.structures.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rodrigosasaki.structures.queue.ArrayQueue;
import com.rodrigosasaki.structures.queue.Queue;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayQueueTest{

	@Test
	public void shouldEnqueue10ItemsAndDequeueInCorrectOrder(){
		Queue<Integer> q = new ArrayQueue<Integer>();

		for (int i = 0; i < 10; i++){
			q.enqueue(i);
		}

		for (int i = 0; i < 10; i++){
			assertEquals(Integer.valueOf(i), q.dequeue());
		}
	}

	@Test
	public void shouldEnqueue20ItemsAndDequeueInCorrectOrder(){
		Queue<Integer> q = new ArrayQueue<Integer>();

		for (int i = 0; i < 20; i++){
			q.enqueue(i);
		}

		for (int i = 0; i < 20; i++){
			assertEquals(Integer.valueOf(i), q.dequeue());
		}
	}

	@Test
	public void shouldShowCorrectSizeInDifferentStages(){
		Queue<Integer> q = new ArrayQueue<Integer>();

		assertEquals(0, q.size());

		for (int i = 0; i < 20; i++){
			q.enqueue(i);
			assertEquals(i + 1, q.size());
		}

		for (int i = 20; i > 0; i--){
			q.dequeue();
			assertEquals(i - 1, q.size());
		}

		assertEquals(0, q.size());
	}

	@Test
	public void shouldReturnIteratorInRightOrder(){
		Queue<Integer> q = new ArrayQueue<Integer>();
		for (int i = 5; i < 10; i++){
			q.enqueue(i);
		}
		
		for (int i = 0; i < 5; i++){
			q.enqueue(i);
		}

		for (int i = 0; i < 5; i++){
			q.dequeue();
		}

		for (int i = 5; i < 10; i++){
			q.enqueue(i);
		}
		
		int expected = 0;
		for(Integer i : q){
			assertEquals(Integer.valueOf(expected++), i);
		}

	}

}
