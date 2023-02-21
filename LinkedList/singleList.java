package herovired.LinkedList;

public class singleList {
	static class Node{
		Node next;
		int val;
		Node(int val){
			this.val = val;
			next = null;
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,4,3,2,1};
		Node head = create(arr);
		print(head);
		/*addAtEnd(10,head);	
		print(head);
		head = addAtStart(111,head);
		print(head);
		addAfter(4,15,head);
		print(head);
		delete(111,head);
		print(head);
		head = reverse(head);
		System.out.println("reversing");
		print(head);
		System.out.println(diffOddEven(head));*/
		if(palindrome(head))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	}
	public static Node reverse(Node head) {
		Node root = null;
		Node temp = null;
		while(head!=null) {
			if(root == null)
				root = new Node(head.val);
			else {
				temp = new Node(head.val);
				temp.next = root;
				root = temp;
			}
			head = head.next;
		}
		return root;
	}
	public static boolean palindrome(Node head) {
		Node head2 = reverse(head);
		while(head!=null) {
			if(head.val != head2.val)
				return false;
			head = head.next;
			head2 = head2.next;
		}
		return true;
	}
	public static int diffOddEven(Node head) {
		int oddSum = 0;
		int evenSum = 0;
		Node temp = head;
		while(temp!=null) {
			int n = temp.val;
			if(n%2 == 0)
				evenSum += n;
			else
				oddSum += n;
			temp = temp.next;
		}
		return oddSum - evenSum;
	}
	public static Node create(int[] arr) {
		Node head = null;
		Node temp = null;
		for(int i:arr) {
			if(head == null) {
				temp = new Node(i);
				head = temp;
			}else {
				temp.next = new Node(i);
				temp = temp.next;
			}
		}
		return head;
	}
	public static void addAtEnd(int ele,Node head) {
		Node temp = head;
		while(temp.next != null) temp = temp.next;
		temp.next = new Node(ele);
	}
	public static Node addAtStart(int ele,Node head) {
		Node temp = head;
		Node temp2 = new Node(ele);
		temp2.next = temp;
		temp = temp2;
		return temp;
	}
	public static void addAfter(int ele1,int ele2,Node head) {
		Node temp = head;
		while(temp.val != ele1){
			temp = temp.next;
		}
		Node temp2 = new Node(ele2);
		temp2.next = temp.next;
		temp.next = temp2;
	}
	public static void print(Node root) {
		Node temp = root;
		while(temp!= null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void delete(int ele,Node head) {
		Node temp = head;
		if(temp.val == ele) {
			head = head.next;
			return;
		}
		while(temp!=null && temp.next!=null) {
			if(temp.next.val == ele) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
	}
}