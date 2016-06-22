package com.rodrigosasaki.structures.stack;

import java.util.Arrays;
import java.util.Iterator;

import com.rodrigosasaki.structures.iterator.ArrayIterator;


/**
 * @author Rodrigo Sasaki
 */
public class ArrayStack<E> implements Stack<E>{

	private static final int INITIAL_CAPACITY = 10;

	private E[] elements;
	private int index;

	public ArrayStack(){
		this(INITIAL_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int size){
		elements = (E[]) new Object[size];
		index = 0;
	}

	@Override
	public void push(E element){
		if (element == null){
			throw new IllegalArgumentException("Cannot push a null element on the stack");
		}
		controlLength();
		elements[index++] = element;
	}
	
	@Override
	public E peek(){
		if (isEmpty()){
			throw new IllegalStateException("Cannot peek an empty stack");
		}
		return elements[index - 1];
	}

	@Override
	public E pop(){
		if (isEmpty()){
			throw new IllegalStateException("Cannot pop from an empty stack");
		}
		controlLength();
		E item = elements[index - 1];
		elements[--index] = null;
		return item;
	}

	@Override
	public int size(){
		return index;
	}

	@Override
	public boolean isEmpty(){
		return index == 0;
	}

	private void controlLength(){
		if (index >= INITIAL_CAPACITY){
			if (index >= elements.length){
				elements = Arrays.copyOf(elements, index * 2);
			} else if (index <= elements.length / 4){
				elements = Arrays.copyOf(elements, elements.length / 2);
			}
		}
	}

	@Override
	public Iterator<E> iterator(){
		return new ArrayIterator<E>(Arrays.copyOf(elements, index));
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		Iterator<E> it = iterator();
		while(it.hasNext()){
			sb.append(it.next());
			sb.append(", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
	}

}
