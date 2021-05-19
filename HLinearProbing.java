import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class HLinearProbing {
    public static void main(String args[])throws IOException{
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);
        // int t = Integer.parseInt(br.readLine().trim());
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            //String str[]=br.readLine().trim().split(" ");
            int capacity = sc.nextInt();
            int n = sc.nextInt();
            // str = br.readLine().trim().split(" ");
            //int a[]=new int[n];
            // ArrayList<Integer> arr=new ArrayList<>();
            //At every entry I only have integer.
            //What I want is that we need ArrayList at every entry so for that we do
            ArrayList<Integer> ht[]=new ArrayList[capacity];
            //cap=5; ht = [null,null,null,null,null];
            for(int i=0; i<n; i++){
                int key = sc.nextInt();
                int hashkey = key%capacity;
                int lastElement = (hashkey-1)%capacity;
                int flag=0;
                while(ht[hashkey]!=null){
                    if(hashkey == lastElement){
                        flag=1;
                        break;
                    }
                    hashkey = (hashkey+1)%capacity;
                }
                if(flag == 1){
                    break;
                }
                ht[hashkey]=new ArrayList<Integer>();
                ht[hashkey].add(key);
            }

            for(int i=0; i<capacity; i++){
                if(ht[i]!=null){
                    //System.out.print(i);
                    ArrayList<Integer> row = ht[i];
                    for(int j=0; j<row.size(); j++){
                        System.out.print(row.get(j)+" ");
                    }
                    //System.out.println();
                }else{
                    System.out.print("-1 ");
                }
            }
            System.out.println();
        }
    }
}
/*
Input:
2
10 4
4 14  24 44
10 11
9 99 999 9999 19 29 99 89 999 999 9

Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
99 999 9999 -1 -1 -1 -1 -1 -1 9

Explanation:
Testcase1: 4%10=4. So put 4 in hashtable[4]. Now, 14%10=4, but hashtable[4] is already filled so put 14 in the next slot and so on.
Testcase2: 9%10=9. So put 9 in hashtable[9]. Now, 99%10=9, but hashtable[9] is already filled so put 99 in the (99+1)%10 =0 slot so 99 goes into hashtable[0] and so on.
*/
