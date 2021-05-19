import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DSACsimpleBinary {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c0=0,c1=0;
		int[] arr=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			if(arr[i]==1) c1++;
			if(arr[i]==0) c0++;
			if(c1==c0)
			count++;
		}
		if(c1==c0){
			System.out.println(count);
		}
		else{
			System.out.print(-1);
		}
	}
}
/*Given an array of N elements where each element is either 1 or 0. You have to divide the array into maximum number of subarrays 
such that each element of the array is in exactly one subarray such that each subarray has equal number of 1's and 0's. 
Sample input 1
4
1 0 1 0

Sample output 1
2

Sample input 2
4
1 1 0 0

Sample output 2
1
*/