package br.com.rodrigosasaki.structures.util;

import org.junit.Test;

import br.com.rodrigosasaki.structures.util.ArrayUtil;
import static org.junit.Assert.*;

/**
 * @author Rodrigo Sasaki
 */
public class ArrayUtilTest{

	@Test
	public void shouldSwapItemsCorrectly(){
		int[] numbers = new int[10];
		
		int num1 = 3;
		int num2 = 7;
		
		for(int i = 0 ; i < numbers.length ; i ++){
			numbers[i] = i;
		}

		int oldNum1 = numbers[num1];
		int oldNum2 = numbers[num2];

		ArrayUtil.swap(numbers, num1, num2);
		
		assertEquals(oldNum1, numbers[num2]);
		assertEquals(oldNum2, numbers[num1]);
	}
	
	@Test
	public void shouldMoveBackwardsCorrectly(){
		int[] numbers = new int[10];
		
		numbers[4] = 4;
		
		ArrayUtil.moveBackwards(numbers, 4, 2);
		
		assertEquals(4, numbers[2]);
	}
	
	@Test
	public void shouldReturnCorrectlyWhenLess(){
		Integer n1 = 1;
		Integer n2 = 2;
		
		assertEquals(true, ArrayUtil.less(n1, n2));
		assertEquals(false, ArrayUtil.less(n2, n1));
	}
}
