package com.epam.app.Calculator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Author: Daria Budchan, May, 2018
 */

class Utils {
    boolean isOperator(char symbol) {
        switch (symbol) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    /**
     * Returns operation priority
     * @param operator: char
     * @return byte: priority
     */
    byte opPriority(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return 1;
    }

    /**
     * Calculates expression in RPN
     * @param strIn: input expression
     * @return double: result
     */
    double calculate(String strIn) throws Exception {
        double operand1 = 0, operand2 = 0;
        String tempString;
        Deque<Double> stack = new ArrayDeque<Double>();
        StringTokenizer st = new StringTokenizer(strIn);
        while(st.hasMoreTokens()) {
            try {
                tempString = st.nextToken().trim();
                if (1 == tempString.length() && isOperator(tempString.charAt(0))) {
                    if (stack.size() < 2) {
                        throw new Exception("Count mismatch in stack " + tempString);
                    }
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    switch (tempString.charAt(0)) {
                        case '+':
                            operand1 += operand2;
                            break;
                        case '-':
                            operand1 -= operand2;
                            break;
                        case '/':
                            operand1 /= operand2;
                            break;
                        case '*':
                            operand1 *= operand2;
                            break;
                        case '%':
                            operand1 %= operand2;
                            break;
                        case '^':
                            operand1 = Math.pow(operand1, operand2);
                            break;
                        default:
                            throw new Exception("Illegal operation " + tempString);
                    }
                    stack.push(operand1);
                } else {
                    operand1 = Double.parseDouble(tempString);
                    stack.push(operand1);
                }
            } catch (Exception e) {
                throw new Exception("Illegal symbol");
            }
        }

        if (stack.size() > 1) {
            throw new Exception("Operator mismatch");
        }

        return stack.pop();
    }
}
