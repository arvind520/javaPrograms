import java.util.*;
public class HLongestConsequtiveSequence {
    public static void longestSquence(int a[], int n){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(a[i]);
        }
        int maxlength=0;
        for(int i=0; i<hs.size(); i++){
            int x=a[i];
            while(hs.contains(x)){
                x++;
            }
            if(maxlength < x-a[i]){
                maxlength = x-a[i];
            }
        }
        System.out.println(maxlength);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        longestSquence(a,n);
    }
}
/*
Sample Input
7
100 4 200 1 3 2 2

Sample Output
4

Explanation
The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/