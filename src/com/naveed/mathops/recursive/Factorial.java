package com.naveed.mathops.recursive;

public class Factorial {
    public static final long factorial(long num) {
        if (num == 0 ||  num == 1) return 1;
        else return num * factorial(num-1);
    }
}
