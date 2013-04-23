package br.com.rodrigosasaki.structures.bag;

/**
 * @author Rodrigo Sasaki
 */
public interface Bag<E> extends Iterable<E>{
	
	public void add(E element);
	
	public int size();
	
	public boolean isEmpty();
	
}
