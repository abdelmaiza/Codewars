package org.example;

import java.util.Arrays;

import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

public class EncryptThis {

//    public static String encryptThis(String text) {
//        return compile(" ").splitAsStream(text)
//                .map(w -> w.isEmpty() ? "" : (int) w.charAt(0) + (w.length() > 2 ? w.replaceFirst(".(.)(.*)(.)", "$3$2$1") : w.substring(1)))
//                .collect(joining(" "));
//    }

    public static String encryptThis(String text) {
        final String[] words = text.split(" ");
        StringBuilder builder = new StringBuilder();
        Arrays.stream(words)
        .filter(s -> s.length() > 0)
        .map(EncryptThis::swap)
        .map(chars -> new StringBuilder().append((int)chars[0]).append(chars,1,chars.length-1).append(" "))
                .forEach(builder::append);
        return builder.toString().trim();
    }

    static char[] swap(String str)
    {
        char[] ch = str.toCharArray();
        if(ch.length > 2){
            char temp = ch[1];
            ch[1] = ch[str.length()-1];
            ch[str.length()-1] = temp;
        }
        return ch;
    }
}


