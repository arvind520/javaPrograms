import java.util.*;
public class DSACtwoSet {
    public static void main (String[] args) {
        // Your code here
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    long sum=0;
    for(int i=1; i<=N; i++){
        sum += i;
    }

    if(sum%2==0){
        System.out.print(0);
    } else{
        System.out.print(1);
    }
    }
}
/*
Consider a sequence of integers from 1 to N (1, 2, 3,. .. . N). Your task is to divide this sequence into two sets such that 
the absolute difference of the sum of these sets is minimum i.e if we divide the sequence in set A and B then |Sum(A) - Sum(B)| 
should be minimum.
Sample Input:-
5

Sample Output:-
1

Explanation:-
Set A:- 1, 2, 5
Set B:- 3. 4

Sample Input:-
8

Sample Output:-
0

Explanation:-
Set A:- 1, 2, 3, 5, 7
Set B;- 4, 6, 8
 */
