import java.io.*;
import java.util.HashMap;
public class HMaxDisBtwnSameEle {
    public static int maxLengthBetweenSameElement(int a[], int n){
        HashMap<Integer, Integer> mp=new HashMap<>();
        int maxlength=0;
        for(int i=0; i<n; i++){
            if(!mp.containsKey(a[i])){
                mp.put(a[i], i);
            }else{
                int l= i-mp.get(a[i]);
                if(maxlength<l){
                    maxlength=l;
                }
            }
        }
        return maxlength;
    }
    public static void main (String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
        int a[]=new int[n];
        String str[]=br.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            a[i]=Integer.parseInt(str[i]);
        }
        System.out.println(maxLengthBetweenSameElement(a,n));
    }
}
/*
Sample Input
6
1 1 2 2 2 1

Sample Output
5

Explanation:-
The index of two occurrences are:- (1, 2), (1, 6), (2, 6), (3, 4), (3, 5), (4, 5)
it can be seen that the maximum distance is between (1, 6) i. e. 5

Sample Input
5
1 1 1 1 1

Sample Output
4
*/