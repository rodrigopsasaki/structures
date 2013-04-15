package br.com.rodrigosasaki.structures.util;

import org.junit.Test;

import br.com.rodrigosasaki.strucutres.util.StructuresUtil;
import static org.junit.Assert.*;

public class StructuresUtilTest{

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

		StructuresUtil.swap(numbers, num1, num2);
		
		assertEquals(oldNum1, numbers[num2]);
		assertEquals(oldNum2, numbers[num1]);
	}
}
