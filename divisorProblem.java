import java.io.*;
import java.util.*;

class divisorProblem{
	public static int divisor(int n){
		int c=0,i=2;
		while(n!=1){
			if(n%i==0){
				n=n/i;
				c++;
			}
		i++;
		}
		return c;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int div = divisor(n);
		System.out.println(div);
	}
	
	
}