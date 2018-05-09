package com.epam.app.Chief;

import com.epam.app.Chief.DAO.DBStream;
import com.epam.app.Chief.IOStream.IOStream;
import com.epam.app.Chief.Vegetables.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Daria Budchan, May, 2018
 */

public class Main {
    public static void main (String args[]) {
        System.out.println("---- Vegetables ----");
        Potato p1 = new Potato(10.0);
        Potato p2 = new Potato(7.0);
        Garlic g1 = new Garlic(2.2);
        Garlic g2 = new Garlic(5.6);
        Tomato t1 = new Tomato(6.1);
        Tomato t2 = new Tomato(3.5);
        Cucumber c1 = new Cucumber(11.0);

        List<Vegetable> v = new ArrayList<Vegetable>(Arrays.asList(p1, p2, g1, g2, t1, t2, c1));
        Utils u = new Utils();
        List<Vegetable> v1 = u.sortByTaste(v, "SWEET");
        System.out.println(v1);
        System.out.println();

        List<Vegetable> v2 = u.sortByShape(v, "ROUND");
        System.out.println(v2);
        System.out.println();

        List<Vegetable> v3 = u.sortByColour(v, "WHITE");
        System.out.println(v3);
        System.out.println();


        System.out.println("---- IO Stream ----");
        IOStream stream = null;
        try {
            stream = new IOStream("./src/main/resources/output.txt");
            String msg = "<Something>";
            System.out.println("Write to file file: " + msg);
            stream.write(msg);
        } catch (IOException e) {
            System.out.print("Exception");
        }

        try {
            stream = new IOStream("./src/main/resources/output.txt");
            System.out.print("Read from file: ");
            stream.read();
        } catch (IOException e) {
            System.out.print("Exception");
        }

        System.out.println();
        System.out.println("---- Database ----");
        DBStream dbStream = null;
        dbStream = new DBStream();
        String msg = "Hello there!";
        System.out.println("Write to DB: " + msg);
        dbStream.write(msg);

        System.out.print("Read from file: ");
        dbStream.read();


    }
}
