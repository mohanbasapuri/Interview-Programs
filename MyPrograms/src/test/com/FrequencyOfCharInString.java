package test.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FrequencyOfCharInString {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("BAT", "ANT", "ANT", "CAT", "BAT", "ANT");

        Set<String> distinct = new TreeSet<>(list);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}