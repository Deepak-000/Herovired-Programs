package herovired;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		fun(5-1);
	}
	public static void fun(int n) {
		if(n <= 1) return;
		fun(n-1);
		fun(n-2);
		System.out.print(n + " ");
	}
}
