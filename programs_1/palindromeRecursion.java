package herovired;
import java.util.*;
public class palindromeRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		if(palin(s,0,s.length()-1))
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static boolean palin(String s,int st,int end) {
		if(s.charAt(st) != s.charAt(end))
			return false;
		st++;
		end--;
		if(st==end)
			return true;
		return palin(s,st,end);
	}

}
