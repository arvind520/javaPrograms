import java.io.*;
import java.util.Arrays;
public class DSATourism {
    public static int minTravelCost(int a[], int n, int unitCost, int teleportCost){
        int sum=0;
        for(int i=1; i<n; i++){
            int unit = (a[i]-a[i-1])*unitCost;
            if(unit < teleportCost){
                sum+=unit;
            }else{
                sum+=teleportCost;
            }
        }
        return sum;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().trim().split(" ");
        int n=Integer.parseInt(str[0]);
        int unitCost=Integer.parseInt(str[1]);
        int teleportCost=Integer.parseInt(str[2]);
        int x[]=new int[n]; //distance on x-axis
        str=br.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            x[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(x);
        int ans = minTravelCost(x,n,unitCost,teleportCost);
        System.out.println(ans);
    }
}
/*
Sample Input 
4 2 5
1 2 5 7

Sample Output 
11

From town 1, walk a distance of 1 to town 2, then teleport to town 3, then walk a distance of 2 to town 4. 
The total increase of your fatigue level in this case is 2×1 + 5 + 2×2 = 11, which is the minimum possible value. */