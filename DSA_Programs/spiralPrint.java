package herovired;
//import java.util.*;
public class spiralPrint {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[][]arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int d = 0,l = 0,r = 2,b = 2,t = 0;
		while(t <= b && l <= r) {
			if(d == 0) {
				for(int i = l ; i <= r ; i++)
					System.out.print(arr[t][i]+" ");
				t++;
			}
			else if(d == 1){
				for(int i = t ; i <= b ;i++)
					System.out.print(arr[i][r]+" ");
				r--;
			}else if(d == 2) {
				for(int i = r;i >= l ; i--)
					System.out.print(arr[b][i]+" ");
				b--;
			}else {
				for(int i = b ; i >= t ; i-- )
					System.out.print(arr[i][l]+" ");
				l++;
			}
			d++;
			d %= 4;
		}
	}
}