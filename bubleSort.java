import java.io.*;
import java.util.*;
class bubleSort {
    public static void bubbleSort(int a[], int n){
		for(int i=1; i<n-1; i++){
			int f=0;
			for(int j=0; j<n-i; j++){
				if(a[j]>a[j+1]){
					f=1;
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			if(f==0)	break;
		}
	}

	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			// int n=sc.nextInt();
			// int a[] = new int[n];
			// for(int i=0; i<n; i++){
			// 	a[i]=sc.nextInt();
			// }
			int a[] = {6,21,43,3,5,6,67};
			bubbleSort(a,a.length);
			for(int i=0; i<a.length; i++){
				System.out.print(a[i]+" ");
			}
            System.out.println();
			t--;
		}
	}
}
