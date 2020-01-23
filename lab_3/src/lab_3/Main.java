package lab_3;
import java.util.Iterator;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		 Stack<Integer> stack = new ALStack<Integer>();
		 
		 
		 int num = args.length == 1 ? Integer.parseInt(args[0]) : 10;
		 System.out.println("Stack: " + stack);
	     System.out.println("push");

	     for (int i = 0; i < num; ++i) {
	         stack.push(i);
	         System.out.print(i + ": ");
	         System.out.print(stack);
	         System.out.println();
	     }
	     System.out.println("Stack: " + stack);

	     Integer i;

	     System.out.println("pop");
	     while ((i = stack.pop()) != null) {
            System.out.print(i + ": ");
	        System.out.print(stack);
	        System.out.println();
	     }
	     System.out.println("Stack: " + stack);
	}
}
	interface Stack<E> extends Iterable<E>{
		boolean empty();
		E peek();
		E pop();
		void push(E data);
		
	}
	class ALStack<E> implements Stack<E>{
		private class StackIterator<E> implements Iterator<E>
		{
			public boolean hasNext()
			{
				return curr > 0;
			}
			public E next()
			{
				return (E) stack.listIterator(curr);
				
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
			private int curr = top;
			
		}
		public boolean empty() {
			return stack.isEmpty();
			
		}
	
		public E pop() {
			
			if(stack.isEmpty()) {
				return null;
			}
			
			return stack.remove(stack.size() - 1);
				
		}
		
		public void push(E data) {
			stack.add(data);
		}
		public E peek() {
			E temp = pop();
			push(temp);
			return temp;
			
		}
		public Iterator<E> iterator() {
		
			return new StackIterator<E>();
		}
		
		public String toString() {
			return stack.toString();
	 
	 	}
		private int top;
		private ArrayList<E> stack = new ArrayList<E>(10);
		
	}


