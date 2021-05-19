/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DSACtheGabba
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    long n = sc.nextLong();
	    long m = sc.nextLong();
	    long x = sc.nextLong();
	    long y = sc.nextLong();
	    long a = n;
	    long ans = 0;
	    if(n == 0){
	        System.out.print(0);
	        return;
	    }
	    if((x*n)<=m){
	        ans = n;
	    }
	    else{
	        ans = m/x;
	        m = m%x;
	        m = m+y;
	        n = n-ans-1;
	        a--;
	        while(n>0){
	            while(ans<a && m>=x){
	                ans++;
	                m = m-x;
	            }
	            m = m+y;
	            n--;
	            a--;
	        }
	    }
	    System.out.print(ans);
	}
}
/*Australia hasn’t lost a Test Match at the Gabba since 1988. India has to win this one, but unfortunately all of their players 
are injured.

You are given the following information:
1. A total of N players are available, all are injured initially.
2. You have M magic pills. Using X pills, you can make any one player fit for match.
3. Alternatively, you can exchange any player for Y magic pills.

Compute the maximum number of players you can make fit for the Gabba Test Match.

Note: "Exchanging" a player means that player will no longer be available and you will gain Y extra magic pills for the exchange

Sample Input:-
5 10 2 1

Sample Output:-
5

Explanation:-
You can make all players fit if you use all the pills.

Sample Input:-
3 10 4 2

Sample Output:-
2

Explanation:-
You can make 2 players fit using the initial candies. Otherwise, Exchanging one player would result in a total of 10+2=12 
magic pills. This is enough to make 3 players fit, but you won't have 3 players remaining. */