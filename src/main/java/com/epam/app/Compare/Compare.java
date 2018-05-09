package com.epam.app.Compare;

import java.util.*;

/**
 * Author: Daria Budchan, May, 2018
 */

public class Compare {

    public static void main(String args[]) {
        ListsComparator listsComparator = new ListsComparator();
        listsComparator.run();

        SetsComparator setsComparator = new SetsComparator();
        setsComparator.run();

        MapsComparator mapsComparator = new MapsComparator();
        mapsComparator.run();
    }
}

