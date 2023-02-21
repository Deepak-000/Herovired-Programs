package herovired;
import java.util.*;
class que{
	List <Integer> q;
	que(){
		q = new ArrayList<>();
	}
	public void push(int ele) {
		q.add(0,ele);
	}
	public void pop() {
		if(q.size() == 0)
			return;
		int ele = q.get(q.size() - 1);
		System.out.println("Popped Element : "+ele);
		q.remove(q.size() - 1);
	}
}
public class Queue {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		que queue = new que();
		List<Integer> Q1 = queue.q;
		Q1.add(1);
		Q1.add(2);
		Q1.add(3);
		Q1.add(4);
	}
	
}
