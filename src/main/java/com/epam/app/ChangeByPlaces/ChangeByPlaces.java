package com.epam.app.ChangeByPlaces;

import java.util.ArrayList;

/**
 * Author: Daria Budchan, May, 2018
 */

public class ChangeByPlaces {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = prepareList();

        for(int i=1; i < list.size(); i+=2) {
            String str = list.get(i);
            char a[] = str.toCharArray();
            char tmp = a[0];
            a[0] = a[a.length - 1];
            a[a.length - 1] = tmp;
            String newStr = new String(a);
            System.out.println(str + " -> " + newStr);
        }
    }

    private static ArrayList<String> prepareList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("donotchange1");
        list.add("0_abcdefgh_9");
        list.add("donotchange2");
        list.add("1_test_8");
        list.add("donotchange3");
        list.add("2_some_7");
        list.add("donotchange4");
        list.add("3_another_6");
        list.add("donotchange5");
        list.add("4_qwerty_5");
        return list;
    }

}
