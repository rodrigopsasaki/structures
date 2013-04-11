package br.com.rodrigosasaki.structures.bag;

import java.util.Arrays;
import java.util.Iterator;

import br.com.rodrigosasaki.structures.iterator.ArrayIterator;

public class Bag<E> implements Iterable<E>{
	
	private E[] elements;
	private int index;
	
	@SuppressWarnings("unchecked")
	public Bag(){
		elements = (E[]) new Object[10];
		index = 0;
	}
	
	public void add(E e){
		ensureCapacity(index);
		elements[index ++] = e;
	}
	
	private void ensureCapacity(int capacity){
		if(capacity >= elements.length){
			elements = Arrays.copyOf(elements, capacity * 2);
		}
	}

	public int size(){
		return index;
	}

	@Override
	public Iterator<E> iterator(){
		return new ArrayIterator<E>(elements);
	}

}
