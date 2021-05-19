import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class HCountDistinct {
    public static void findDistinctCount(int a[],int n, int k){
        int dis = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(i<k){
                if(!mp.containsKey(a[i])){
                    mp.put(a[i], 1);
                    dis++;
                }else{
                    mp.put(a[i], mp.get(a[i])+1);
                }
            }
            if(i>=k){
                //removing first element and checking what effects are occur due to this
                if(mp.containsKey(a[i-k])){
                    mp.put(a[i-k], mp.get(a[i-k])-1);
                    if(mp.get(a[i-k]) == 0){
                        dis--;
                    }
                }
                //adding new element
                if(mp.containsKey(a[i])){
                    if(mp.get(a[i])==0){
                        mp.put(a[i], 1);
                        dis++;
                    }
                }else{
                    mp.put(a[i], 1);
                    dis++;
                }
            }
            if(i>=k-1){
                System.out.print(dis+" ");
            }
        }
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().trim().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        str=br.readLine().trim().split(" ");
        int a[]=new int[n];
        for(int i=0 ;i<n; i++){
            a[i]=Integer.parseInt(str[i]);
        }
        findDistinctCount(a,n,k);
    }
}
/*Sample Input :
7 4
1 2 1 3 4 2 3

Sample Output:
3 4 4 3 */