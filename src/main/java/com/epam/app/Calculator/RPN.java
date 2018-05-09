package com.epam.app.Calculator;

/**
 * Author: Daria Budchan, May, 2018
 */

class RPN {
    /**
     * Translates inserted string to reverse polish notation.
     * @param inputString: Input expression
     * @return string in reverse polish notation
     */
    String toRPN(String inputString) throws Exception {
        StringBuilder sbStack = new StringBuilder(""), sbOut = new StringBuilder("");
        char cIn, cTmp;
        Utils utils = new Utils();

        for (int i = 0; i < inputString.length(); i++) {
            cIn = inputString.charAt(i);
            if (utils.isOperator(cIn)) {
                while (sbStack.length() > 0) {
                    cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                    if (utils.isOperator(cTmp) && (utils.opPriority(cIn) <= utils.opPriority(cTmp))) {
                        sbOut.append(" ").append(cTmp).append(" ");
                        sbStack.setLength(sbStack.length() - 1);
                    } else {
                        sbOut.append(" ");
                        break;
                    }
                }
                sbOut.append(" ");
                sbStack.append(cIn);
            } else if (cIn == '(') {
                sbStack.append(cIn);
            } else if (cIn == ')') {
                cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                while (cTmp != '(') {
                    if (sbStack.length() < 1) {
                        throw new Exception("Parenthesis error! Check expression!");
                    }
                    sbOut.append(" ").append(cTmp);
                    sbStack.setLength(sbStack.length() - 1);
                    cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                }
                sbStack.setLength(sbStack.length() - 1);
            } else {
                // If symbol is not an operator, add it to output
                sbOut.append(cIn);
            }
        }

        // If there are operators in stack, add them to string
        while (sbStack.length() > 0) {
            sbOut.append(" ").append(sbStack.substring(sbStack.length() - 1));
            sbStack.setLength(sbStack.length() - 1);
        }
        return  sbOut.toString();
    }
}
