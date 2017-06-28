package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * Created by waler on 13/04/2015.
 */
public class BubbleSort {

    public static <T extends Comparable<T>> void sort(List<T> elements) {
        if(elements == null) {
            throw new IllegalArgumentException("List to sort cannot be null.");
        }
        boolean swapped = true;
        System.out.println("init = " + elements);
        for(int i = elements.size() -1 ; i > 0 && swapped ; i--){
            swapped = false;
            for(int j=0 ; j<i ; j++) {
                if(elements.get(j).compareTo(elements.get(j+1))> 0) {
                    swapped = true;
                    SortUtils.swapInList(elements, j, j + 1);
                    System.out.println("i="+i+" , j="+j+ " Kolekcja=" + elements);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        if(array == null) {
            throw new IllegalArgumentException("Array to sort cannot be null.");
        }
        boolean swapped = true;

        for(int i = array.length -1 ; i > 0 && swapped ; i--){
            swapped = false;
            for(int j=0 ; j<i ; j++) {
                if(array[j].compareTo(array[j+1])> 0) {
                    swapped = true;
                    SortUtils.swapInArray(array, j, j + 1);
                }
            }
        }
    }
}
