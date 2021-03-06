package com.yq.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ericyang
 * @version 1.0
 * 该类用来说明AtomicInteger不会出错
 */
public class AtomicCounter implements Counter{
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void incrementCount() {
       count.incrementAndGet();
    }

    @Override
    public int getCount() {
      return count.get();
    }

}
