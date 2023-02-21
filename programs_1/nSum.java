package herovired;

public class nSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = fsum(1,10);
		System.out.println(sum);
	}
	public static int fsum(int num,int gnum) {
		if(num > gnum)
			return 0;
		return num + fsum(num+1,gnum);
	}

}