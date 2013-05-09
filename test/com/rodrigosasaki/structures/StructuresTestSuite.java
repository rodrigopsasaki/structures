package com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.rodrigosasaki.structures.bag.ArrayBagTest;
import com.rodrigosasaki.structures.list.ArrayListTest;
import com.rodrigosasaki.structures.queue.ArrayQueueTest;
import com.rodrigosasaki.structures.stack.ArrayStackTest;


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
