package com.epam.app.Calculator;

import java.io.*;

/**
 * Author: Daria Budchan, May, 2018
 */

public class Calculator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strIn;
        RPN rpn = new RPN();
        Utils utils = new Utils();

        try {
            System.out.println("Insert an expression [ +, -, *, /, ^, %, (, ) ]:");
            strIn = reader.readLine();
            strIn = rpn.toRPN(strIn);
            System.out.println(utils.calculate(strIn));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
