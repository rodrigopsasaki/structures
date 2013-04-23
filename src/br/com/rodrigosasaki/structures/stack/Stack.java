package br.com.rodrigosasaki.structures.stack;

/**
 * @author Rodrigo Sasaki
 */
public interface Stack<E> extends Iterable<E>{

	public void push(E element);

	public E pop();

	public E peek();

	public int size();

	public boolean isEmpty();

}
