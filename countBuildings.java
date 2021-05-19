import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class countBuildings{
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextLong();
		}
		long max=0;
		int count=0;
		for(int i=0; i<n; i++){
			if(arr[i]>max){
				count++;
				max=arr[i];
			}
		}
		System.out.println(count);
	}
}