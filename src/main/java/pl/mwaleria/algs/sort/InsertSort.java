package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * @Author <a href="mailto:Walerianczyk.Marcin@gmail.com">Marcin Walerianczyk</a>
 */
public class InsertSort {
    public static <T extends Comparable<T>> void sort(List<T> elements) {
        if(elements == null) {
            throw new IllegalArgumentException("List to sort cannot be null.");
        }

        for(int i = 1 ; i < elements.size(); i++) {
            T key = elements.get(i);
            int j = i-1;
            while (j >= 0 && elements.get(j).compareTo(key) > 0) {
                elements.set(j+1,elements.get(j));
                elements.set(j,key);
                j = j-1;
            }
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        if(array == null) {
            throw new IllegalArgumentException("Array to sort cannot be null.");
        }
        for(int i = 1 ; i < array.length; i++) {
            T key = array[i];
            int j = i-1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j+1] = array[j];
                array[j] = key;
                j = j-1;
            }
        }

    }
}
