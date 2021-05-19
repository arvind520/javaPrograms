import java.io.*;
import java.util.*;
public class candyCrush {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int sum=0;
            while(n>0){
                int c=0;
                if(n<=3){
                    sum+=n;
                    break;
                }
                if(n%3==0){
                    c=n/3;
                }else{
                    c=n/3 + 1;
                }
                sum=sum+(c*c);
                n=n-c;
            }
            System.out.println(sum);
            t--;
        }
    }
}
