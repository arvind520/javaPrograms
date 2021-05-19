import java.io.*;
import java.util.HashMap;
public class HMaxFreq {
    public static void findMaxFreqElement(int a[], int n){
        HashMap<Integer, Integer> mp=new HashMap<>();
        int maxf=0;
        int maxk=0;
        for(int i=0; i<n; i++){
            if(!mp.containsKey(a[i])){
                mp.put(a[i], 1);
                if(maxf <= 1){
                    maxf = 1;
                    if(maxk < a[i]){
                        maxk = a[i];
                    }
                }
            }else{
                mp.put(a[i], mp.get(a[i])+1);
                if(maxf < mp.get(a[i])){
                    maxf= mp.get(a[i]);
                    maxk= a[i];
                }
                if(maxf == mp.get(a[i])){
                    if(maxk < a[i]){
                        maxk = a[i];
                    }
                }
            }
        }
        System.out.println(maxk);
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        String str[]=br.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            a[i]=Integer.parseInt(str[i]);
        }
        findMaxFreqElement(a,n);
    }
}
/*

5
1 4 2 4 5

7
1 4 2 4 2 5 3 

8
1 4 2 4 2 5 3 2

*/