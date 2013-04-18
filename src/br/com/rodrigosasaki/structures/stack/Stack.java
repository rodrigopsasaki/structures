package br.com.rodrigosasaki.structures.stack;

import java.util.Arrays;
import java.util.Iterator;

import br.com.rodrigosasaki.structures.iterator.ArrayIterator;

/**
 * @author Rodrigo Sasaki
 */
public class Stack<E> implements Iterable<E>{

	private static final int INITIAL_CAPACITY = 10;

	private E[] elements;
	private int index;

	public Stack(){
		this(INITIAL_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public Stack(int size){
		elements = (E[]) new Object[size];
		index = 0;
	}

	public void push(E element){
		if (element == null){
			throw new IllegalArgumentException("Cannot push a null element on the stack");
		}
		controlLength();
		elements[index++] = element;
	}
	
	public E peek(){
		if (isEmpty()){
			throw new IllegalStateException("Cannot peek an empty stack");
		}
		return elements[index - 1];
	}

	public E pop(){
		if (isEmpty()){
			throw new IllegalStateException("Cannot pop from an empty stack");
		}
		controlLength();
		return elements[--index];
	}

	public int size(){
		return index;
	}

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
		if (!isEmpty()){
			for (int i = 0; i < index; i++){
				sb.append(elements[i] + ", ");
			}
			sb.deleteCharAt(sb.lastIndexOf(","));
		}
		sb.append("]");
		return sb.toString();
	}

}
