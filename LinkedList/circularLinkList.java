package herovired.LinkedList;

public class circularLinkList {
	static class Node{
		int val;
		Node next = null;
		Node(int val){
			this.val = val;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node list = createList(arr);
		list = addToStart(list,12);
		//print(list);
		boolean res = isCircular(list);
		System.out.println(res);
	}
	public static Node createList(int []arr) {
		Node head = null;
		Node temp = null;
		for(int i:arr) {
			if(head == null)
				head = temp = new Node(i);
			else {
				temp.next = new Node(i);
				temp = temp.next;
			}
		}
		temp.next = head;
		return head;
	}
	public static Node addToStart(Node head,int val) {
		Node st = new Node(val);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = st;
		st.next = head;
		return st;
	}
	public static void print(Node head) {
		Node temp = head;
		System.out.print(temp.val+" ");
		temp = temp.next;
		while(temp != head) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static boolean isCircular(Node head) {
		Node fp = head;
		Node sp = head;
		while(true) {
			if(sp == null || fp == null)
				return false;
			if(sp == fp)
				break;
			sp = sp.next;
			fp = fp.next.next;
		}
		return true;
	}
}
