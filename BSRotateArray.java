import java.io.*;
import java.util.*;

class BSRotateArray{
	public static int element(int arr[],int l,int r){
		int d=0;
		while(l<=r){
		int mid = (l+r)/2;
		if(arr[mid]<arr[mid-1])
		    {
				d=arr[mid];
				break;
			}
		if(arr[mid]>arr[mid+1])
		    {
				d=arr[mid+1];
				break;
			}
		if(arr[mid]<arr[l])
		{
			r=mid-1;
		}
		else
		{
			l = mid+1;
		} 
		}
		return d;
	}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
		while(t>0){
			int n=sc.nextInt();
			int a[]=new int[n];

			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
            
            System.out.println(element(a,0,n-1));
            
			t--;
		}
    }
}