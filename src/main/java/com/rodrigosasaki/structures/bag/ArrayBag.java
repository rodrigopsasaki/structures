package com.rodrigosasaki.structures.bag;

import java.util.Arrays;
import java.util.Iterator;

import com.rodrigosasaki.structures.iterator.ArrayIterator;


/**
 * @author Rodrigo Sasaki
 */
public class ArrayBag<E> implements Bag<E>{

	private E[] elements;
	private int index;

	public ArrayBag(){
		this(10);
	}

	@SuppressWarnings("unchecked")
	public ArrayBag(int size){
		elements = (E[]) new Object[size];
		index = 0;
	}

	@Override
	public void add(E e){
		controlLength();
		elements[index++] = e;
	}

	private void controlLength(){
		if (index >= elements.length){
			elements = Arrays.copyOf(elements, index * 2);
		}
	}

	@Override
	public int size(){
		return index;
	}

	@Override
	public boolean isEmpty(){
		return index == 0;
	}

	@Override
	public Iterator<E> iterator(){
		return new ArrayIterator<E>(elements);
	}

}
