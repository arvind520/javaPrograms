import java.io.*;
import java.util.ArrayList;
public class Hashing {
    public static void main(String args[])throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String str[]=br.readLine().trim().split(" ");
            int capacity = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            //int a[]=new int[n];
            // ArrayList<Integer> arr=new ArrayList<>();
            //At every entry I only have integer.
            //What I want is that we need ArrayList at every entry so for that we do
            ArrayList<Integer> ht[]=new ArrayList[capacity];
            //cap=5; ht = [null,null,null,null,null];
            for(int i=0; i<n; i++){
                int key = Integer.parseInt(str[i]);
                int hashkey = key%capacity;
                if(ht[hashkey] == null){
                    //first time i am entering the key
                    //so we need to make null = ArrayList
                    //so for that
                    ht[hashkey] = new ArrayList<Integer>();  // this will make null to arrayList
                    ht[hashkey].add(key);
                    //<-------------Or we can do---------->
                    /*
                    ArrayList<Interger> temp = ht[hashkey] --> this is the variable to store a ArrayList
                    temp.add(key);
                    ht[hashkey]=temp;
                    */
                }else{
                    ht[hashkey].add(key);
                }
            }

            for(int i=0; i<capacity; i++){
                if(ht[i]!=null){
                    System.out.print(i);
                    ArrayList<Integer> row = ht[i];
                    for(int j=0; j<row.size(); j++){
                        System.out.print("->"+row.get(j));
                    }
                    System.out.println();
                }
            }
            System.out.println("~");
        }
    }
}
/*
Sample Input:
2
10 6
92 4 14 24 44 91
10 5
12 45 36 87 11

Sample Output:
1->91
2->92
4->4->14->24->44
~
1->11
2->12
5->45
6->36
7->87
~

Explanation:
Testcase1: 92%10=2 so 92 goes to slot 2. 4%10=4 so 4 goes to slot 4. 14%10=4. But 4 is already occupied so we make a linked list at this position and add 14 after 4 in slot 4 and so on.
Testcase2: 12%10=2 so 12 goes to slot 2. 45%10=5 goes to slot 5. 36%10=6 goes to slot 6. 87%10=7 goes to slot 7 and finally 11%10=1 goes to slot 1.
*/
