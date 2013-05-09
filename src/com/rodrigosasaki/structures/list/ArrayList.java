package com.rodrigosasaki.structures.list;

import java.util.Arrays;
import java.util.Iterator;

import com.rodrigosasaki.structures.functional.Filter;
import com.rodrigosasaki.structures.functional.Function;
import com.rodrigosasaki.structures.functional.Mapper;
import com.rodrigosasaki.structures.iterator.ArrayIterator;
import com.rodrigosasaki.structures.util.ArrayUtil;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayList<E> implements List<E>, Cloneable{

	private static final int INITIAL_CAPACITY = 10;

	private E[] elements;
	private int index;

	public ArrayList(){
		this(INITIAL_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayList(int size){
		elements = (E[]) new Object[size];
		index = 0;
	}

	@Override
	public void add(E e){
		controlLength();
		elements[index++] = e;
	}

	@Override
	public void set(int index, E e){
		elements[index] = e;
	}

	@Override
	public E get(int i){
		return elements[i];
	}

	@Override
	public E remove(int i){
		index--;
		E removedElement = elements[i];
		ArrayUtil.moveBackwards(elements, i + 1, 1);
		controlLength();
		return removedElement;
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
	public Object[] toArray(){
		return Arrays.copyOf(elements, elements.length);
	}

	@Override
	public int size(){
		return index;
	}

	@Override
	public boolean isEmpty(){
		return index == 0;
	}

	public ArrayList<E> filter(Filter<E> filter){
		ArrayList<E> newList = new ArrayList<E>();
		for (E e : this){
			if (filter.apply(e)){
				newList.add(e);
			}
		}
		return newList;
	}

	public ArrayList<E> map(Mapper<E> mapper){
		ArrayList<E> newList = new ArrayList<E>();
		for (E e : this){
			newList.add(mapper.apply(e));
		}
		return newList;
	}

	public void forEach(Function<E> function){
		for (E e : this){
			function.apply(e);
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
		while (it.hasNext()){
			sb.append(it.next());
			sb.append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	public List<E> clone(){
		try{
			return (List<E>) super.clone();
		} catch (CloneNotSupportedException e){
			throw new InternalError();
		}
	}

}
