package herovired;

public class palinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "11";
		if(palin(s,0)) {
			System.out.println("yes");
		}
		else {
			System.out.println("NO");
		}
	}
	public static boolean palin(String s,int i) {
		int n = s.length();
		if(n == 0 || n==1)
			return true;
		if(i == n/2+1) {
			return true;
		}
		if(s.charAt(i) != s.charAt(n-i-1)) {
			return false;
		}
		return palin(s,i+1) ;
	}

}
