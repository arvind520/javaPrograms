import java.io.BufferedReader;
import java.io.IOException;

// Sample Input:-
// 5 4
// 1 0 1 0
// 0 1 0 1
// 1 0 1 0
// 0 1 0 1
// 1 0 1 0

// Sample Output:-
// 3

// Explanation:-
// (1, 2), (2, 1) and (3, 2) are good cells
import java.io.*;
import java.util.*;
public class Goodcells {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line1[] = br.readLine().trim().split(" ");
        int n=Integer.parseInt(line1[0]);
        int m=Integer.parseInt(line1[1]);
        int a[][]=new int[n][m];
        for(int i=0; i<n; i++){
            String eachLine[] = br.readLine().trim().split(" ");
            for(int j=0; j<m; j++){
                a[i][j] = Integer.parseInt(eachLine[j]);
            }
        }
        int c=0;
        for(int i=1; i<n-1; i++){
            for(int j=1; j<m-1; j++){
                if(a[i-1][j]==1 && a[i+1][j]==1 && a[i][j+1]==1 && a[i][j-1]==1){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    
}
