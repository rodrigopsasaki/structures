package br.com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rodrigosasaki.structures.bag.ArrayBagTest;
import br.com.rodrigosasaki.structures.list.ArrayListTest;
import br.com.rodrigosasaki.structures.queue.ArrayQueueTest;
import br.com.rodrigosasaki.structures.stack.ArrayStackTest;

/**
 * @author Rodrigo Sasaki
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	ArrayBagTest.class, 
	ArrayStackTest.class, 
	ArrayQueueTest.class,
	ArrayListTest.class
})
public class StructuresTestSuite{

}
