package com.epam.app.Compare;

import java.util.Collection;

/**
 * Author: Daria Budchan, May, 2018
 */

class Comparator {

    protected static final Integer N = 1000000;

    static void generate(Collection a) {
        for (int i = 0; i <= N; i++) {
            a.add(i);
        }
    }

    static void compareAdd(Collection a, Collection b) {
        System.out.println("-------- Add");
        measureAdd(a);
        measureAdd(b);
    }

    private static void measureAdd(Collection x) {
        long start, end, dif;
        start = System.nanoTime();
        x.add(42);
        end = System.nanoTime();
        dif = end - start;
        System.out.println(x.getClass().getName() + " add: " + String.format("%,12d", dif) + " ns");
    }

    static void compareRemove(Collection a, Collection b) {
        System.out.println("-------- Remove");
        measureRemove(a);
        measureRemove(b);
    }

    private static void measureRemove(Collection x) {
        long start, end, dif;
        start = System.nanoTime();
        x.remove(42);
        end = System.nanoTime();
        dif = end - start;
        System.out.println(x.getClass().getName() + " add: " + String.format("%,12d", dif) + " ns");
    }

//    static void compareGet(Collection a, Collection b) {
//        System.out.println("-------- Get element");
//        measureGet(a);
//        measureGet(b);
//    }
//
//    private static void measureGet(Object x) {
//        System.out.println("Not implemented :(");
//    }
}
