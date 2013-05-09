package com.rodrigosasaki.structures.comparators;

import java.util.Comparator;

/**
 * @author Rodrigo Sasaki
 */
public class IntegerComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer one, Integer other){
		if(one == null){
			return -1;
		}else if(other == null){
			return 1;
		}else{
			return one.compareTo(other);
		}
	}

}
