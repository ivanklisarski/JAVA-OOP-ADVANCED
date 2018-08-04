package Generics.customListSort;

public class customListSort {


    private customListSort() {
    }

    public static <T extends Comparable<T>> void sort(customList<T> myList) {
        myList.sortAsc();
    }

}

