import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BSshipLoad {

    public static int calculateDays(int a[], int n, int mid){
        int days=0,sum=0;
        for(int i=0; i<n; i++){
            if(sum+a[i] <= mid){
                sum+=a[i];
            }else{
                days++;
                sum=a[i];
            }
        }
        if(sum>0){
            days++;
        }
        return days;
    }

	public static int minWeight(int a[], int n, int d){
        int low=0,high=0;
        for(int i=0; i<n; i++){
            low = Math.max(low, a[i]);
            high+=a[i];
        }
        while(low<high){
            int mid= low+(high-low)/2;
            int daysReqires = calculateDays(a,n,mid);
            if(daysReqires > d){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
	


	public static void main (String[] args) throws IOException {
        
		// BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(read.readLine());
        // while(t-- > 0){
        //     String str[] = read.readLine().trim().split(" ");
        //     int N = Integer.parseInt(str[0]);
        //     int D = Integer.parseInt(str[1]);
        //     int arr[] = new int[N];
        //     String str3[] = read.readLine().trim().split(" ");
        //     for(int i = 0; i < N; i++){
        //         arr[i] = Integer.parseInt(str3[i]);
        //     }
		// 	int minWeightForShip = minWeight(arr, N, D);
		// 	System.out.println(minWeightForShip);
        // }

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            int minWeightForShip = minWeight(a, n, d);
            System.out.println(minWeightForShip);
        }
	}
}