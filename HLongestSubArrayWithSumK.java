import java.io.*;
public class HLongestSubArrayWithSumK {
    public static int longestSubArray(int a[], int n, int k){
        int sum=0;
        int eleFreq = 0;
        int maxlength=0;
        for(int i=0; i<n; i++){
            if(sum+a[i]<k){
                sum+=a[i];
                eleFreq++;
            }
            else if(sum+a[i]==k){
                sum+=a[i];
                eleFreq++;
                if(maxlength<eleFreq){
                    maxlength=eleFreq;
                }
            }
            else{
                sum=sum-a[i-eleFreq];
                while(sum+a[i]>k){
                    sum-=a[i];
                    eleFreq--;
                }
                sum=sum+a[i];
                if(sum==k){
                    if(maxlength<eleFreq){
                        maxlength=eleFreq;
                    }
                }
            }
        }
        return maxlength;
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String str[]=br.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            str=br.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0; i<n; i++){
                a[i]=Integer.parseInt(str[i]);
            }
            System.out.println(longestSubArray(a,n,k));
        }
    }
}
/*
Sample Input:
1
6 15
10 5 2 7 1 9
6 -5
-5 8 -14 2 4 12
3 6
-1 2 3

Sample Output:
4
5
0
*/