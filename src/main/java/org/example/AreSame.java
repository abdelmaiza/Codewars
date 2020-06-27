package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (Objects.isNull(a) || Objects.isNull(b) || a.length !=  b.length)
            return false;
        List<Integer> list1 = Arrays.stream(a).boxed()
                .map(integer -> integer * integer)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(b).boxed().sorted().collect(Collectors.toList());
        return list1.equals(list2);
    }


}
