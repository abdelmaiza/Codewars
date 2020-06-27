package org.example;

public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / ((float) normPrice * discount / 100));
    }
}
