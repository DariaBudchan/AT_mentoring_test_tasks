package com.epam.app.Compare;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Author: Daria Budchan, May, 2018
 */

class ListsComparator extends Comparator{

    void run() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        generate(a);

        LinkedList<Integer> b = new LinkedList<Integer>();
        generate(b);

        System.out.println("\n------ Lists");
        compareAdd(a, b);
        compareRemove(a, b);
        compareGet(a, b);
    }

    static void compareGet(AbstractList a, AbstractList b) {
        System.out.println("-------- Get element");
        measureGet(a);
        measureGet(b);
    }

    private static void measureGet(AbstractList x) {
        long start, end, dif;
        start = System.nanoTime();
        x.indexOf(42);
        end = System.nanoTime();
        dif = end - start;
        System.out.println(x.getClass().getName() + " add: " + String.format("%,12d", dif) + " ns");
    }
}
