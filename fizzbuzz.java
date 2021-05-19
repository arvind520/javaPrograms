import java.io.*;
import java.util.*;

class FizzBuzz{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			if(i%(3*5)==0){
				System.out.print("FizzBuzz ");
			}
			else if(i%3==0){
				System.out.print("Fizz ");
			}
			else if(i%5==0){
				System.out.print("Buzz ");
			}else{
				System.out.print(i+" ");
			}
		}
	}
}