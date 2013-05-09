package com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.rodrigosasaki.structures.sort.InsertionSortTest;
import com.rodrigosasaki.structures.sort.MergeSortTest;
import com.rodrigosasaki.structures.sort.SelectionSortTest;
import com.rodrigosasaki.structures.sort.ShellSortTest;


/**
 * @author Rodrigo Sasaki
 */
@RunWith(Suite.class)
@SuiteClasses(
{ 
	SelectionSortTest.class,
	InsertionSortTest.class,
	ShellSortTest.class,
	MergeSortTest.class
})
public class SortingTestSuite{

}
