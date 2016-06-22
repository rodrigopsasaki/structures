package com.rodrigosasaki.structures.shuffle;

import static com.rodrigosasaki.structures.util.ArrayUtil.swap;

import java.util.Random;

import com.rodrigosasaki.structures.list.List;


/**
 * @author Rodrigo Sasaki
 */
public class FisherYatesShuffle{

	public static void shuffle(byte[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}

	public static void shuffle(char[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}

	public static void shuffle(int[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}

	public static void shuffle(long[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}

	public static void shuffle(float[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}

	public static void shuffle(double[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}
	
	public static void shuffle(Object[] array){
		int i = array.length - 1;
		Random random = new Random();
		while (i > 0){
			swap(array, random.nextInt(i), i--);
		}
	}
	
	public static <T extends Comparable<T>> void shuffle(List<T> list){
		int i = list.size() - 1;
		Random random = new Random();
		while (i > 0){
			swap(list, random.nextInt(i), i--);
		}
	}

}
