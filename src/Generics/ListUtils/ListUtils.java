package Generics.ListUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListUtils<T> {



    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;  }


    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;  }


    public static <T> void flatten(List<? super T> dest, List<List<? extends T>> src) {

        for (List<? extends T> inner : src) {
            dest.addAll(inner);
        }
    }

    public static <T> void addAll(List<? super T> dest, List<? extends T> source) {

        dest.addAll(source);
    }


}
