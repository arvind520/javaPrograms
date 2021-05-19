import java.io.*;
import java.util.*;
public class DSACSimpleCircle {
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;++i) a[i]=sc.nextInt();
        Arrays.sort(a);
        long ans =a[n-1];
        for(int i=n-2,x=1;x<n-2;x+=2,i-=1)
        {
            ans = ans+2*a[i];
            // System.out.println(a[i]);
        }
        System.out.println(ans);
    }
}
/*People prefer smartness over anything. You know N people and their smartness level. You need to place people in a circle 
one by one in any order. The happiness that a person gets is equal to the minimum smartness value of its clockwise neighbour and 
its anti-clockwise neighbour at the time when he enters the circle. You can ask the person to stand at any 
position of the circle that you like. The happiness of the first person to enter is 0 since he has no neighbours.

Sample Input 1

4

2 2 1 3

Sample Output 1

7

Explanation 1

We ask the persons to enter the circle in this particular order of smartness [3, 2, 2, 1].

Step 1: 

3

Happiness attained = 0

Step 2

3

2

Happiness attained = 3

Step 3

3

  2 

2



Happiness attained = 2



Step 4

  3

1   2

  2

Happiness attained = 2

Total Happiness = 0 + 3 + 2 + 2 = 7.



Sample Input 2

2

1 1



Sample Output 2


1




Approach :
If you do this for 8 elements->  3 1 4 2 8 6 7 5 

Now sort it in reverse ->8 7 6 5 4 3 2 1

sum = 0

According to question, 

8 comes -> sum =0                               -> (no element initially)

7 comes -> sum = 0+8                            ->(one element present, added) 

6 comes -> sum = 0+8+7                          ->(6 would be inserted between 8 & 7 and lowest of them would be added in sum)

5 comes -> sum = 0+8+7+7                        ->(5 would be inserted between 8 and 7 and lowest of them will be added in sum)

4 comes -> sum = 0+8+7+7+ 6                   ->(4 would be added btw 6 and 7 ans lowest of them would be added in sum)

3 comes -> sum = 0+8+7+7+6+6                    ->(3 would be added 6 and 8 and lowest of them would be added in sum)

2 comes -> sum = 0+8+7+7+6+6+5                  ->(2 would be added 5 and 8 and lowest of them would be added in sum)

1 comes -> sum = 0+8+7+7+6+6+5+5                ->(1 would be added 5 and 7 and lowest of them would be added in sum)

.

Follow the pattern, you will get the logic.
*/