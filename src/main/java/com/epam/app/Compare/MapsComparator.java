package com.epam.app.Compare;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Author: Daria Budchan, May, 2018
 */

class MapsComparator extends Comparator{
    void run() {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        generate(a);

        TreeMap<Integer, Integer> b = new TreeMap<Integer, Integer>();
        generate(b);

        System.out.println("\n------ Maps");
        compareAdd(a, b);
        compareRemove(a, b);
    }

    static void generate(AbstractMap a) {
        for (int i = 0; i <= N; i++) {
            a.put(i, i*10);
        }
    }

    static void compareAdd(AbstractMap a, AbstractMap b) {
        System.out.println("-------- Add");
        measureAdd(a);
        measureAdd(b);
    }

    private static void measureAdd(AbstractMap x) {
        long start, end, dif;
        start = System.nanoTime();
        x.put(N + 1, (N + 1)*10);
        end = System.nanoTime();
        dif = end - start;
        System.out.println(x.getClass().getName() + " add: " + String.format("%,12d", dif) + " ns");
    }

    static void compareRemove(AbstractMap a, AbstractMap b) {
        System.out.println("-------- Remove");
        measureRemove(a);
        measureRemove(b);
    }

    private static void measureRemove(AbstractMap x) {
        long start, end, dif;
        start = System.nanoTime();
        x.remove(42);
        end = System.nanoTime();
        dif = end - start;
        System.out.println(x.getClass().getName() + " add: " + String.format("%,12d", dif) + " ns");
    }
}
