import java.io.*;
import java.util.*;

public class HQuadractiveProbing {
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int capacity = sc.nextInt();
            int n=sc.nextInt();
            ArrayList<Integer> ht[] = new ArrayList[capacity]; // ht[]={null,null,....,null};
            for(int i=0; i<n; i++){
                int key = sc.nextInt();
                int hashkey = key%capacity;
                int k=1;
                while(ht[hashkey] != null){
                    hashkey = (key + (k*k))%capacity;
                    k++;
                }
                ht[hashkey] = new ArrayList<Integer>();
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
/*Quadratic probing is a collision handling technique in hashing. Quadratic probing says that whenever a collision occurs, 
search for i^2 position.

In this question, we'll learn how to fill up the hash table using Quadratic probing technique. 
You are given hash table size which you'll use to insert elements into their correct position in the hash table i.e.(arr[i]%hashSize).
You are also given an array arr[] of size N. You need to fill up the hash table using Quadratic probing and print the resultant hash 
table.

Note:

1. All the positions that are unoccupied are denoted by -1 in the hash table.
2. An empty slot can only be found if load factor < 0.5 and hash table size is a prime number.
3. The given testcases satisfy the above condition so you can assume that an empty slot is always reachable.

Input:
2
11 4
21 10 32 43
11 4
880 995 647 172 

Output:
10 -1 -1 32 -1 -1 -1 -1 43 -1 21
880 -1 -1 -1 -1 995 -1 172 -1 647 -1 

Explanation:
Testcase1: 21%11=10 so 21 goes into hashTable[10] position. 10%11=10. hashTable[10] is already filled so we try for (10+1)%11=0 
position. hashTable[0] is empty so we put 10 there. 32%11=10. hashTable[10] is filled. We try (32+1)%11=0. But hashTable[0] is 
also already filled. We try (32+4)%11=3. hashTable[3] is empty so we put 32 in hashTable[3] position. 43 uses (43+9)%11=8. We 
put it in hashTable[8].

Testcase2: Using the similar approach as used in above explanation we will get the output like 880 -1 -1 -1 -1 995 -1 172 -1 647 -1 .
*/