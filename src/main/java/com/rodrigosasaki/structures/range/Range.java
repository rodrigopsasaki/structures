package com.rodrigosasaki.structures.range;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * @author Rodrigo Sasaki
 */
public class Range implements Iterable<Integer>{

    private final Integer start;
    private final Integer end;
    private Integer step;
    private boolean inclusive;

    private Range(Integer start, Integer end, Integer step, boolean inclusive) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.inclusive = inclusive;
    }

    public static Range inclusive(Integer start, Integer end) {
        return new Range(start, end, 1, true);
    }

    public static Range exclusive(Integer start, Integer end) {
        return new Range(start, end, 1, false);
    }

    public Range withStep(Integer step){
        this.step = step;
        return this;
    }

    private void validateStep(Integer step) {
        if (step == 0){
            throw new IllegalArgumentException("Invalid step, please select a non-zero value");
        } else if (step < 0 && start < end){
            throw new IllegalArgumentException("Cannot have a negative step if the end value is greater than the start value");
        } else if (step > 0 && start > end){
            throw new IllegalArgumentException("Cannot have a positive step if the start value is greater than the end value");
        }
    }

    private boolean hasPositiveStep(){
        return step > 0;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            private Integer current = start;

            @Override
            public boolean hasNext() {
                validateStep(step);
                if(hasPositiveStep()) {
                    return inclusive ? current <= end : current < end;
                } else {
                    return inclusive ? current >= end : current > end;
                }
            }

            @Override
            public Integer next() {
                if(hasNext()){
                    Integer returnValue = current;
                    current += step;
                    return returnValue;
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void forEachRemaining(Consumer<? super Integer> action) {
                throw new UnsupportedOperationException();
            }
        };
    }

}

