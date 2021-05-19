import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DSAsmallestDigit {
    public static boolean check_prime(int n){
        int c=0; 
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            return true;
        }else{
            return false;
        }
    }
    public static int next_prime(int n){
        if(n==1){
            return 2;
        }
        int j=n;
        while(true){
            if(check_prime(j)){
                return j;
            }
            j++;
        }
    }
	public static int smallest_digit(int n){
		if(n<=9 && n>=0){
			return n;
		}
		int s=9;
		while(n>0){
			int m=n%10;
			if(m<s){
				s=m;
			}
			n=n/10;
		}
		return s;
	}
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		for(int i=n; i<=m; i++){
			int cp = next_prime(i);
            System.out.print(cp+" ");
			int smd = smallest_digit(cp);
			sum+=smd;
		}
        System.out.println();
		System.out.println(sum);
	}
}