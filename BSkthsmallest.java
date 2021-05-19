// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework
// import java.lang.Math;

// // don't change the name of this class
// // you can add inner classes if needed
// class kthsmallest {
// 	public static int countsValue(int a[], int n, int mid){
// 		int c=0;
// 		for(int i=0; i<n-1; i++){
// 			for(int j=i+1; j<n; j++){
// 				if(Math.abs(a[i]-a[j]) <= mid){
// 					c++;
// 				}else{
// 					break;
// 				}
// 			}
// 		}
// 		return c;
// 	}
// 	public static int kthValue(int a[], int n, int k){
// 		int l=0;
// 		int h=Math.abs(a[0]-a[n-1]);
// 		while(l<=h){
// 			int mid= l+(h-l)/2;
// 			int numValue = countsValue(a,n,mid);
// 			if(numValue > k){
// 				h=mid-1;
// 			}else if(numValue < k) {
// 				l = mid+1;
// 			}else{
// 				return mid;
// 			}
// 		}
// 		return l;
// 	}
// 	public static void main (String[] args) {
//         Scanner sc=new Scanner(System.in);
// 		int t=sc.nextInt();
// 		while(t>0){
// 			int n=sc.nextInt();
// 			int k=sc.nextInt();
// 			int a[]=new int[n];
// 			for(int i=0;i<n;i++){
// 				a[i]=sc.nextInt();
// 			}
// 			Arrays.sort(a,0,n);
// 			int kthvalue = kthValue(a,n,k);
// 			System.out.println(kthvalue);
// 			t--;
// 		}
// 	}
// }


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static int count(int diff, int[] arr, int N){
		int i =0;
		int countAns = 0;
		for(int j=1; j<N; j++){
			while(arr[j]-arr[i] > diff){
				i++;
			}
			countAns += (j-i);
		}
		return countAns;
	}

	public static int kthSmallest(int[] arr, int N, int K){
		Arrays.sort(arr);
		int minDiff = 0;
		int maxDiff = arr[N-1] - arr[0];

		while(minDiff < maxDiff){
			int mid = minDiff + (maxDiff-minDiff)/2;
			int c = count(mid, arr, N);
			if(c < K){
				minDiff = mid+1;
			}
			else{
				maxDiff = mid;
			}
		}
		return maxDiff;
	}
	public static void main (String[] args) throws IOException{
                      // Your code here
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[1]);
            int arr[] = new int[N];
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
			System.out.println(kthSmallest(arr, N, K));
        }
	}
}