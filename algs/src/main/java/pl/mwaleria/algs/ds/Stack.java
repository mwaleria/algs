package pl.mwaleria.algs.ds;


public class Stack<T> {

	private Entry<T> head = null;
	
	private int size;
	
	public void push(T e) {
		Entry<T> element = new Entry<T>();
		element.thiz = e;
		element.previous = null;
		
		if(head != null) {
			element.previous = head;
		}
		head  = element;
		size ++;
	}
	
	public T pop() {
		if(head == null )
			return null;
		Entry<T> entry = head;
		this.head = entry.previous;
		size --;
		return entry.thiz;
	}
	
	public int size() {
		return size;
	}
	
	public static class Entry<T> {
		protected T thiz;
		protected Entry<T> previous;
	}
	
	public Object[] toArray() {
		Object[] array = new Object[size];
		
		if(size == 0 ) { 
			return  array;
		}
		Entry<T> tmp = head;
		for(int i=0 ; i< size ; i++) {
			array[i] = tmp.thiz;
			tmp = tmp.previous;
		}
		return  array;
	}
	
	public boolean contains(T object) {
		
		if(object == null)
			return false;
		
		Entry<T> tmp  = head;
		if(head == null)
			return false;
		
		do {
			if(tmp.thiz != null && tmp.thiz.equals(object))
				return true;
		}while((tmp = tmp.previous) != null) ;
		return false;
	}
}
