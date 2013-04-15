package br.com.rodrigosasaki.structures.shuffle;

import static br.com.rodrigosasaki.strucutres.util.StructuresUtil.swap;

import java.util.Random;

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

}
