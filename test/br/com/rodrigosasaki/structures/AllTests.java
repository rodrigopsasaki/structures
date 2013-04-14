package br.com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rodrigosasaki.structures.bag.BagTest;
import br.com.rodrigosasaki.structures.iterator.ArrayIteratorTest;
import br.com.rodrigosasaki.structures.sorting.selectionsort.SelectionSortTest;
import br.com.rodrigosasaki.structures.stack.StackTest;

@RunWith(Suite.class)
@SuiteClasses({ BagTest.class, ArrayIteratorTest.class, StackTest.class, SelectionSortTest.class })
public class AllTests{

}
