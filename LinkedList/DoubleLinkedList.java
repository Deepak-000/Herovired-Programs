package herovired.LinkedList;

public class DoubleLinkedList {
	static class dNode{
		dNode prev = null;
		dNode next = null;
		int val;
		dNode(int val ){
			this.val = val;
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8};
		dNode head = create(arr);
		print(head);
		/* head = addStart(head,0);
		print(head);
		addLast(head,9);
		print(head);
		deleteAfter(head,3);
		print(head);*/
		printl(head);
	}
	public static void deleteAfter(dNode root,int val1) {
		dNode temp = root;
		while(temp != null) {
			if(temp.val == val1) {
				temp.next = temp.next.next;
				if(temp.next.next != null)
					temp.next.next.prev = temp;
				return;
			}
			temp = temp.next;
		}
	}
	
	public static void addLast(dNode root,int val) {
		dNode node  = new dNode(val);
		dNode temp = root;
		while(temp.next != null)
				temp = temp.next;
		temp.next = node;
		node.prev = temp;
	}
	public static dNode addStart(dNode root,int val) {
		dNode node = new dNode(val);
		node.next = root;
		root.prev = node;
		return node;
	}
	public static dNode create(int[] arr) {
		dNode root = null;
		dNode temp = null;
		for(int i:arr) {
			if(root == null) {
				root = temp = new dNode(i);
			}else {
				temp.next = new dNode(i);
				temp.next.prev = temp;
				temp = temp.next;
			}
		}
		return root;
	}
	public static void printl(dNode root) {
		dNode temp = root;
		while(temp.next != null) {
			temp = temp.next;
		}
		while(temp != null) {
			System.out.print(+temp.val+" -> ");
			temp = temp.prev;
		}
		System.out.println(" null");
	}
	public static void print(dNode root) {
		dNode temp = root;
		while(temp!= null) {
			System.out.print(+temp.val+" -> ");
			temp = temp.next;
		}
		System.out.println(" null");
	}
}
