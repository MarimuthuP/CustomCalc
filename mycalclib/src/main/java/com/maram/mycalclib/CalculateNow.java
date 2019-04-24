package com.maram.mycalclib;

public class CalculateNow {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Divide by zero error");
        else
            return a / b;
    }
}
