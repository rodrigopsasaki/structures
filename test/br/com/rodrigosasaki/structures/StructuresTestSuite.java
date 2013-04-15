package br.com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rodrigosasaki.structures.bag.BagTest;
import br.com.rodrigosasaki.structures.stack.StackTest;

@RunWith(Suite.class)
@SuiteClasses({ BagTest.class, StackTest.class })
public class StructuresTestSuite{

}
