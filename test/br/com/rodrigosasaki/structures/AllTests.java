package br.com.rodrigosasaki.structures;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Rodrigo Sasaki
 */
@RunWith(Suite.class)
@SuiteClasses(
	{
		IteratorsTestSuite.class,
		ShufflingTestSuite.class,
		SortingTestSuite.class,
		StructuresTestSuite.class,
		UtilTestSuite.class 
	})
public class AllTests{

}
