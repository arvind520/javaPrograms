import java.io.*;
import java.util.*;

class changecoin{
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		long sum1=0,sum2=0,sum3=0,min1=0,min2=0,min3=0;
		while(sum1<=n){
			sum1+=500;
		}
		while(sum1<=n){
			sum1+=200;
		}
		//sum1+=200;
		while(sum2<=n){
			sum2+=200;
		}
		//sum2+=200;
		while(sum3<=n){
			sum3+=500;
		}
		//sum3+=500;
		min1=sum1-n;
		min2=sum2-n;
		min3=sum3-n;
		//if(min1<=min2 && min1 <= min3){
			System.out.println(sum1);
		//}else if(min2<=min1 && min2<=min3){
			System.out.println(sum2);
		//}else{
			System.out.println(sum3);
		//}
	}
}