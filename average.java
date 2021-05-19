import java.io.*;
import java.util.*;
import java.lang.*;

class average{
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[] = new long[n];
		long sum = 0;
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			sum+=arr[i];
		}
		System.out.println((int)Math.floor(sum/n));
	}
}