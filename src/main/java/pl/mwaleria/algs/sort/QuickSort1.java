package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * Created by walema1 on 27.06.2017.
 */
public class QuickSort1 {
    public static <T extends Comparable<T>> void sort(List<T> elements) {
        if(elements == null) {
            throw new IllegalArgumentException("List to sort cannot be null.");
        }
        quickSort(elements,0,elements.size()-1);
    }

    private static  <T extends Comparable<T>> void quickSort(List<T> elements, int leftIndex,int rightIndex) {
        if(leftIndex < rightIndex) {
            int middleIndex = getMiddle(leftIndex,rightIndex);
            T middleElement = elements.get(middleIndex);
            SortUtils.swapInList(elements,middleIndex,rightIndex);
            int actual = leftIndex;
            for(int i = leftIndex ; i < rightIndex ; i ++) {
                if(elements.get(i).compareTo(middleElement) < 0) {
                    SortUtils.swapInList(elements,actual,i);
                    actual ++;
                }
            }
            SortUtils.swapInList(elements,actual,rightIndex);
            quickSort(elements,leftIndex,actual-1);
            quickSort(elements,actual+1,rightIndex);
        }
    }

    private static int getMiddle(int leftIndex, int rightIndex) {
        int sum = leftIndex + rightIndex;
        if(sum%2 == 0) {
            return sum / 2;
        }
        return (sum-1)/2;
    }
}
