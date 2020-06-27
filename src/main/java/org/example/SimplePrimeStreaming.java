package org.example;


import java.util.ArrayList;
import java.util.List;

/*
* https://www.codewars.com/kata/5a908da30025e995880000e3/train/java
*/
public class SimplePrimeStreaming {

    private static StringBuilder builder;
    static {
        List<Integer> primes = new ArrayList<>();
        for(int i = 2 ; i < 50000 ; i++){
            boolean prime = true;
            for(int j = 2 ; j < i ; j++){
                if( i % j == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                primes.add(i);
            }
        }
        builder = new StringBuilder();
        primes.stream().map(String::valueOf).forEach(builder::append);
    }

    public static String solve(int a, int b) {
        return builder.substring(a , a+b);
    }
}
