import java.io.*;
public class FoodContest {
    public static int numOfDishes(int a[], int n, int time){
        int dishes=0;
        for(int i=n-1; i>=0; i--){
            dishes+= (time/a[i]);
        }
        return dishes;
    }
    public static int min_time(int a[], int n, int min, int max, int p){
        int l = min*p;
        int r = max*p;
        
        while(l>=r){
            int mid=l+(r-l)/2;
            int cal = numOfDishes(a,n,mid);
            if(cal>p){
                r=mid-1;
            }else if(cal<p){
                l=mid+1;
            }else{
                return mid;
            }
        }
        return l;
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line1[] = br.readLine().trim().split(" ");
        int n=Integer.parseInt(line1[0]);
        int p = Integer.parseInt(line1[1]);
        int a[]=new int[n];
        String line2[] = br.readLine().trim().split(" ");
        int min=100000,max=0;
        for(int i=0; i<n; i++){
            a[i]=Integer.parseInt(line2[i]);
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        int mint = min_time(a,n,min,max,p);
        System.out.println(mint);
	}
}
