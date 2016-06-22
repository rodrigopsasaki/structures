package com.rodrigosasaki.structures.range;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author Rodrigo Sasaki
 */
public class RangeTest {

    @Test
    public void testSimpleInclusiveRange(){
        Iterator<Integer> iterator = Range.inclusive(1, 10).iterator();

        assertEquals(1,  iterator.next().intValue());
        assertEquals(2,  iterator.next().intValue());
        assertEquals(3,  iterator.next().intValue());
        assertEquals(4,  iterator.next().intValue());
        assertEquals(5,  iterator.next().intValue());
        assertEquals(6,  iterator.next().intValue());
        assertEquals(7,  iterator.next().intValue());
        assertEquals(8,  iterator.next().intValue());
        assertEquals(9,  iterator.next().intValue());
        assertEquals(10, iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSimpleExclusiveRange(){
        Iterator<Integer> iterator = Range.exclusive(1, 10).iterator();

        assertEquals(1,  iterator.next().intValue());
        assertEquals(2,  iterator.next().intValue());
        assertEquals(3,  iterator.next().intValue());
        assertEquals(4,  iterator.next().intValue());
        assertEquals(5,  iterator.next().intValue());
        assertEquals(6,  iterator.next().intValue());
        assertEquals(7,  iterator.next().intValue());
        assertEquals(8,  iterator.next().intValue());
        assertEquals(9,  iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testInclusiveRangeWithStep2(){
        Iterator<Integer> iterator = Range.inclusive(1, 10).withStep(2).iterator();

        assertEquals(1, iterator.next().intValue());
        assertEquals(3, iterator.next().intValue());
        assertEquals(5, iterator.next().intValue());
        assertEquals(7, iterator.next().intValue());
        assertEquals(9, iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testExclusiveRangeWithStep2(){
        Iterator<Integer> iterator = Range.exclusive(1, 11).withStep(2).iterator();

        assertEquals(1, iterator.next().intValue());
        assertEquals(3, iterator.next().intValue());
        assertEquals(5, iterator.next().intValue());
        assertEquals(7, iterator.next().intValue());
        assertEquals(9, iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testInclusiveRangeWithNegativeStep(){
        Iterator<Integer> iterator = Range.inclusive(10, 1).withStep(-3).iterator();

        assertEquals(10, iterator.next().intValue());
        assertEquals(7,  iterator.next().intValue());
        assertEquals(4,  iterator.next().intValue());
        assertEquals(1,  iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testExclusiveRangeWithNegativeStep(){
        Iterator<Integer> iterator = Range.exclusive(10, 1).withStep(-3).iterator();

        assertEquals(10, iterator.next().intValue());
        assertEquals(7,  iterator.next().intValue());
        assertEquals(4,  iterator.next().intValue());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testCanIterateWithForech(){
        Integer counter = 1;
        for(Integer i : Range.inclusive(1, 10)){
            assertEquals(counter ++, i);
        }
        assertEquals(11, counter.intValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailsOnNegativeStepWithStartLowerThanEnd(){
        Range.inclusive(1, 10).withStep(-3).iterator().next();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailsOnPositiveStepWithStartHigherThanEnd(){
        Range.inclusive(35, 10).iterator().next();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailsOnZeroStep(){
        Range.inclusive(1, 2).withStep(0).iterator().next();
    }

}

