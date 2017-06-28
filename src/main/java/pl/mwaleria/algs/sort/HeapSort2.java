package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * Created by walema1 on 28.06.2017.
 */
public class HeapSort2 {

    public static <T extends Comparable<T>> void sort(List<T> elements) {
        if(elements == null) {
            throw new IllegalArgumentException("List to sort cannot be null.");
        }
       int total = elements.size() - 1;
        for (int i = total / 2; i >= 0; i--)
            heapify(elements, i,total);
        for (int i = total; i > 0; i--) {
            SortUtils.swapInList(elements,0,i);
            total--;
            heapify(elements, 0,total);
        }
    }


    private static <T extends Comparable<T>> void heapify(List<T> elements, int index, int maxIndex)  {
        int leftIndex = 2*index;
        int rightIndex = 2*index+1;
        int largest = index;
        if(leftIndex <= maxIndex && elements.get(leftIndex).compareTo(elements.get(largest)) > 0) {
            largest = leftIndex;
        }
        if(rightIndex <= maxIndex && elements.get(rightIndex).compareTo(elements.get(largest)) > 0) {
            largest = rightIndex;
        }
        if(largest != index) {
            SortUtils.swapInList(elements,index,largest);
            heapify(elements,largest,maxIndex);
        }
    }


}

