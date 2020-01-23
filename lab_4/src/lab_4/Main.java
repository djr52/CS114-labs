package lab_4;
import java.util.Iterator;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new ALQueue<Integer>();
		
		int NUM = 10;
		
		System.out.println(queue);
        System.out.println("enqueue");
        queue.enqueue(0);
        

        for (int i = 0; i < NUM; ++i) {
            queue.enqueue(i+1);
            System.out.print(i + ": ");
            for (int j : queue) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        Integer i;

        System.out.println("dequeue");

        while ((i = queue.dequeue()) != null) {
            System.out.print(i + ": ");
            for (int j : queue) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
		
	}

}
interface Queue<E> extends Iterable<E>{
	public E dequeue();
	void enqueue(E data);
	
	
	
}

class ALQueue<E> implements Queue<E>{
	 private class QueueIterator<E> implements Iterator<E> {
	        public boolean hasNext() {
	            return curr != tail;
	        }
	        public E next() {
	            E temp = (E)queue.get(curr);
	            curr = (curr+1) % queue.size();
	            return temp;
	        }
	        public void remove() {
	            throw new UnsupportedOperationException();
	        }
	        private int curr = head;
	    }
	
	
	
	
	public Iterator<E> iterator() {
		
		return new QueueIterator<E>();
		
	}
	
	public E dequeue() {
		E temp = null;
		if(head != tail) {
			temp = (E)queue.get(head);
			head = (head+1) % queue.size();
			
		}
		return temp;
	}
	
	public void enqueue(E data) {
		
		queue.add(data);
		tail = (tail + 1) % queue.size();
		
		
	}
	
	
	private ArrayList<E> queue = new ArrayList<E>(10);
	private int head;
	private int tail;
	
	
	
}