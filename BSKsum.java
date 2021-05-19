import java.io.*;
import java.util.*;
public class BSKsum {
    public static int sumObtain(int a[], int n, int mid){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+= Math.ceil((float)a[i]/mid);
        }
        return sum;
    }

    public static int minDivisble(int a[], int n, int k){
        int l=1;
        int h=0;
        for(int i=0; i<n; i++){
            h = Math.max(h, a[i]);
        }
        while(l<h){
            int mid = l+(h-l)/2;
            int sumo = sumObtain(a,n,mid);
            if(sumo < k){
                h=mid;
            }else if(sumo>k){
                l=mid;
            }else{
                return mid;
            }
        }
        return 1;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line1[] = br.readLine().trim().split(" ");
        int n=Integer.parseInt(line1[0]);
        int k=Integer.parseInt(line1[1]);
        String line2[]= br.readLine().trim().split(" ");
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]=Integer.parseInt(line2[i]);
        }
        int res = minDivisble(a,n,k);
        System.out.println(res);
    }
}
