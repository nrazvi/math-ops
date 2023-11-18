package com.naveed.mathops.recursive;

public class Power {
    public static final long raise(long num, long pwr) {
        if (pwr == 0) return 1;
        if (pwr == 1) return num;
        else return num * raise(num, pwr-1);
    }
}
