package br.com.rodrigosasaki.structures.shuffle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FisherYatesShuffleTest{

	@Test
	public void shouldShuffleArray(){
		int[] numbers = new int[10];
		int[] oldNumbers = new int[10];

		for (int i = 0; i < numbers.length; i++){
			numbers[i] = i;
			oldNumbers[i] = i;
		}
		
		FisherYatesShuffle.shuffle(numbers);
		assertThat(oldNumbers, not(equalTo(numbers)));
	}

}
