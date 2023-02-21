package herovired;
import java.util.*;
class arraySum {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i= 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		int sm = sc.nextInt();
		sc.close();
		if(sum(arr,sm))
			System.out.print("Yes");
		else
			System.out.print("No");
			
	}
	public static boolean sum(int[] arr,int sum) {
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			int x = Arrays.binarySearch(arr,sum-arr[i]);
			if(x >= 0 && i!=x)
				return true;
		}
		return false;
		/*
		 * 6
		 * 10
		 * -6 10 16 8 4 3 8
		 */
	}
}
