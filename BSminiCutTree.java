import java.io.*;
import java.util.*;
public class BSminiCutTree {
    public static int woodCollect(int arr[], int n, int mid) {
		int sum = 0 ;
		for(int i=n-1; i>=0; i--) {
			if(arr[i]-mid <= 0) {
				break;
			} 
			sum += arr[i]-mid ;
		}
		return sum ;
	}

	public static int collectWood(int arr[], int n, int k) {
		Arrays.sort(arr) ;

		int l = 0, r = arr[n-1] ;
		while(l<=r) {
			int mid = (l+r)/2 ;
			int coll = woodCollect(arr, n, mid) ;

			if(coll == k) {
				return mid ;
			}

			if(coll > k) {
				l = mid + 1 ;
			}
			else{
				r = mid - 1 ;
			}
		}
		return l ;
	}

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int k = sc.nextInt() ;
		int[] arr = new int[n] ;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt() ;
		}
		int result = collectWood(arr, n, k) ;
		System.out.print(result) ;
                      // Your code here
	}
}
