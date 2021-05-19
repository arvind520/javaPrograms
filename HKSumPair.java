import java.util.*;
public class HKSumPair {
    public static void countPair(int a[], int n, int k){
        HashMap<Integer, Integer> mp=new HashMap<>();
        int count=0;
        for(int i=0; i<n; i++){
            int X = a[i]%k;
            int Y = (k-X)%k;
            if(mp.containsKey(Y)){
                count+= mp.get(Y);
            }
            if(!mp.containsKey(X)){
                mp.put(X, 1);
            }else{
                mp.put(X, mp.get(X)+1);
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        countPair(a,n,k);
    }
}
/*
5 4
1 2 3 4 5

5 3
4 1 2 5 3
*/