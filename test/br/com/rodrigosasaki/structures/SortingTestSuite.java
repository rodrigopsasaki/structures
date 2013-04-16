package br.com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rodrigosasaki.structures.sort.InsertionSortTest;
import br.com.rodrigosasaki.structures.sort.SelectionSortTest;

/**
 * @author Rodrigo Sasaki
 */
@RunWith(Suite.class)
@SuiteClasses(
{ 
	SelectionSortTest.class,
	InsertionSortTest.class
})
public class SortingTestSuite{

}
