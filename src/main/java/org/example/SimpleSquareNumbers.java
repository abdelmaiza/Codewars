package org.example;

public class SimpleSquareNumbers {
//    public static long solve(int n){
//        for (int i = 1; i < n ; i++) {
//            double sqrt = Math.sqrt((i * i + n));
//            if( sqrt - Math.floor(sqrt) == 0  ){
//               return (long) (i * i);
//           }
//        }
//        return -1;
//    }

    public static long solve(int n){
        double i = Math.ceil(Math.sqrt(n));
        while (--i > 0)
            if (i % 2 == n / i % 2)
                return (long)(Math.pow(n / i - i, 2) / 4);
        return -1;
    }
}
