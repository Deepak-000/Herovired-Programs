package herovired;
class A{
	int x = 50;
}
class B extends A{
	int x = 120;
}
public class inher extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inher i = new inher();
		System.out.println(i.x);
	}

}
