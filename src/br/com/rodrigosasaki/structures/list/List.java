package br.com.rodrigosasaki.structures.list;

/**
 * @author Rodrigo Sasaki
 */
public interface List<E> extends Iterable<E>{

	public void add(E element);

	public E get(int index);

	public E remove(int index);

	public Object[] toArray();

	public int size();

	public boolean isEmpty();

}
