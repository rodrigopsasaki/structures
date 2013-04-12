package br.com.rodrigosasaki.structures.bag;

import java.util.Arrays;
import java.util.Iterator;

import br.com.rodrigosasaki.structures.iterator.ArrayIterator;

/**
 * @author Rodrigo Sasaki
 */
public class Bag<E> implements Iterable<E>{

	private E[] elements;
	private int index;

	public Bag(){
		this(10);
	}

	@SuppressWarnings("unchecked")
	public Bag(int size){
		elements = (E[]) new Object[size];
		index = 0;
	}

	public void add(E e){
		controlLength();
		elements[index++] = e;
	}

	private void controlLength(){
		if (index >= elements.length){
			elements = Arrays.copyOf(elements, index * 2);
		}
	}

	public int size(){
		return index;
	}

	public boolean isEmpty(){
		return index == 0;
	}

	@Override
	public Iterator<E> iterator(){
		return new ArrayIterator<E>(elements);
	}

}
