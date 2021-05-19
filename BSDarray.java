import java.io.*;
import java.util.*;
public class BSDarray {
    public static int binarySearch(int a[], int n, int k){
        int l=0, r=n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(a[mid] == k){
                return 1;
            }else if(a[mid] < k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int a[]=new int[n*m];
        for(int i=0; i<m*n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<q; i++){
            int k=sc.nextInt();
            int res = binarySearch(a,n*m,k);
            if(res == 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}


// Input:-
// 3 4 4
// 4 8 11 14
// 15 54 45 47
// 1 2 3 4
// 5
// 15
// 45
// 26

// Output:-
// No
// Yes
// Yes
// No