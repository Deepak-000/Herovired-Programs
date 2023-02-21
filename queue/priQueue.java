/**
 * 
 */
package herovired.queue;

/**
 * @author Lenovo
 *
 */
//import java.util.*;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class priQueue {

	/**
	 * @param args
	 */
	static class comparator implements Comparator<Integer>{
		public int compare(Integer n1,Integer n2) {
			if(n2%2 == 0)
				return 1;
			if(n1%2 == 0)
				return 1;
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>(new comparator());
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		
		/*PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.add(100);
		PriorityBlockingQueue<String> pbq = new PriorityBlockingQueue<>();
		pbq.add("Kumar");
		pbq.add("Shanmukh");
		pbq.add("Ajay");
		pbq.add("Aaaaaaaa");
		System.out.println(pbq);
		System.out.println(pbq.poll());
		System.out.println(pbq);
		System.out.println(pbq.poll());
		System.out.println(pbq);
		System.out.println(pbq.poll());
		System.out.println(pbq);*/
		
	}

}
