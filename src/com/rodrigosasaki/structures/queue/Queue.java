package com.rodrigosasaki.structures.queue;

/**
 * @author Rodrigo Sasaki
 */
public interface Queue<E> extends Iterable<E>{

	public void enqueue(E element);

	public E dequeue();

	public int size();

	public boolean isEmpty();

}
