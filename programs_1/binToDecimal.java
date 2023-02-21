package herovired;
import java.util.*;
class binToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(bintoDec(st));
		sc.close();
	}
	public static int bintoDec(String s) {
		int n = 0;
		int k = 0;
		for(int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i) == '1')
				n += Math.pow(2,k);
			k++;
		}
		return n;
	}

}
