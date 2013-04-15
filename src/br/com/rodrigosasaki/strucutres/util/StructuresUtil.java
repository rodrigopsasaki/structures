package br.com.rodrigosasaki.strucutres.util;

public class StructuresUtil{

	public static void swap(byte[] elements, int one, int other){
		byte t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

	public static void swap(char[] elements, int one, int other){
		char t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

	public static void swap(int[] elements, int one, int other){
		int t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

	public static void swap(long[] elements, int one, int other){
		long t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

	public static void swap(float[] elements, int one, int other){
		float t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

	public static void swap(double[] elements, int one, int other){
		double t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

	public static void swap(Object[] elements, int one, int other){
		Object t = elements[one];
		elements[one] = elements[other];
		elements[other] = t;
	}

}
