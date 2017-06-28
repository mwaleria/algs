package pl.mwaleria.algs.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by walema1 on 28.06.2017.
 */
public class MergeSort {

	public static <T extends Comparable<T>> void sort(List<T> elements) {
		if(elements == null) {
			throw new IllegalArgumentException("List to sort cannot be null.");
		}
		mergeSort(elements, 0, elements.size() - 1);
	}

	private static <T extends Comparable<T>> void mergeSort(List<T> elements, int start, int end) {
		if(start < end) {
			int middle = (end + start) / 2;
			mergeSort(elements, start, middle);
			mergeSort(elements, middle + 1, end);
			merge(elements, start, end, middle);
		}
	}

	public static <T extends Comparable<T>> void merge(List<T> elements, int start, int end, int middle) {
		List<T> tmpCollection = new ArrayList<>();
		int firstIndex = start;
		int secondIndex = middle + 1;
		int index = start;
		while(start++ <= end) {
			if(secondIndex > end) {
				tmpCollection.add(elements.get(firstIndex++));
			} else if(firstIndex > middle) {
				tmpCollection.add(elements.get(secondIndex++));
			} else if(elements.get(firstIndex).compareTo((T) elements.get(secondIndex)) < 0) {
				tmpCollection.add(elements.get(firstIndex++));
			} else {
				tmpCollection.add(elements.get(secondIndex++));
			}
		}
		for(T t: tmpCollection) elements.set(index++, t);

	}

}
