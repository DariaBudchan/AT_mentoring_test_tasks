package com.epam.app.Compare;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Author: Daria Budchan, May, 2018
 */

public class SetsComparator extends Comparator{

    void run() {
        HashSet<Integer> a = new HashSet<Integer>();
        generate(a);

        TreeSet<Integer> b = new TreeSet<Integer>();
        generate(b);

        System.out.println("\n------ Sets");
        compareAdd(a, b);
        compareRemove(a, b);
    }

}
