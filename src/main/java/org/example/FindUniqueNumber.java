package org.example;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class FindUniqueNumber {
    public static double findUniq(double [] arr) {
//        List<Double> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        return numbers.stream()
//                .filter(i -> Collections.frequency(numbers, i) == 1)
//                .findFirst().orElseGet(null);

        List<Double> duplicates = DoubleStream.of(arr)
                .boxed()
                .collect( Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter( p -> p.getValue() ==1 )
                .map( Map.Entry::getKey )
                .collect( Collectors.toList() );
        return duplicates.get(0);

//        return Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .values()
//                .stream()
//                .filter(aLong -> aLong == 1)
//                .findAny().get();
    }
}
