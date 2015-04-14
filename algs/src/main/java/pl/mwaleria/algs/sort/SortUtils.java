package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * @author <a href="mailto:Walerianczyk.Marcin@gmail.com">Marcin Walerianczyk</a>
 */
public class SortUtils {

    public static void swapInList(List elements, int first , int second) {
        if(elements == null ) {
            throw new IllegalArgumentException("List cannot be null");
        }
        if(first >= elements.size() || second>=elements.size()) {
            throw new IllegalArgumentException("first or second > List size, first = "
                    + first + ", second = "+ second+" list size = "+ elements.size());
        }
        Object tmp = elements.get(first);
        elements.set(first,elements.get(second));
        elements.set(second,tmp);
    }

    public static void swapInArray(Object[] array, int first , int second) {
        if(array == null ) {
            throw new IllegalArgumentException("List cannot be null");
        }
        if(first >= array.length || second>=array.length) {
            throw new IllegalArgumentException("first or second > array size, first = "
                    + first + ", second = "+ second+" array size = "+ array.length);
        }
        Object tmp = array[first];
        array[first]  = array[second];
        array[second] = tmp;
    }
}
