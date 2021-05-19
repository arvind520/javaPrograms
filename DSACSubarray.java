import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DSACSubarray {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[] = new int[n];
		int brr[] = new int[m];

		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0;i<m;i++){
			brr[i] = sc.nextInt();
		}

		int op = 0;
		int min = 100000;
		int res= 0;

		for(int i = 0;i<n-m+1;i++){
			op = 0;
			int k = 0;
			for(int j = i;j<m+i; j++){
				if(arr[j] != brr[k]){
					op+=1;
				}
				k++;
			}
			min = Math.min(min,op);
			res = min;
		}
		//System.out.println(op);
		System.out.println(res);
	}
}

/*Sample Input
6 3
3 1 2 1 3 3
1 2 3

Sample Output
1

Explanation: If you modify A[4] from 1 to 3. A[2]. A[4] represents the array B, so B is its subarray.

Sample Input
10 5
3 4 5 3 4 3 1 3 5 2 
1 4 4 4 3 

Sample Output
3 */