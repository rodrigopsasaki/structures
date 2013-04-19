package br.com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rodrigosasaki.structures.bag.BagTest;
import br.com.rodrigosasaki.structures.queue.QueueTest;
import br.com.rodrigosasaki.structures.stack.StackTest;

/**
 * @author Rodrigo Sasaki
 */
@RunWith(Suite.class)
@SuiteClasses({ BagTest.class, StackTest.class, QueueTest.class })
public class StructuresTestSuite{

}
