package com.example.consultants.week6test;

public class ParenChecker {

    public static boolean check(String input) {

        int parenCounter = 0;
        int braceCounter = 0;
        int bracketCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            //openers, inc count
            if (input.charAt(i) == '(') {
                parenCounter++;
            }
            if (input.charAt(i) == '{') {
                braceCounter++;
            }
            if (input.charAt(i) == '[') {
                bracketCounter++;
            }
            //closers, dec count
            if (input.charAt(i) == ')') {
                parenCounter--;
            }
            if (input.charAt(i) == '}') {
                braceCounter--;
            }
            if (input.charAt(i) == ']') {
                bracketCounter--;
            }

            //if count ever gets negative, then a closer happened before opener, order isn't correct
            if (parenCounter < 0 || braceCounter < 0 || bracketCounter < 0) {
                return false;
            }
        }

        //at end, if all counts are 0, then order is correct
        if (parenCounter == 0 || braceCounter == 0 || bracketCounter == 0) {
            return true;
        } else {
            return false;
        }
    }
}
