import java.util.*;
public class doctorPatients {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int sum=0;
            for(int i=1; i<n; i++){
                sum+=x;
            }
            int res = n*10 - sum - 10;
            System.out.println(res);
            t--;
        }
    }
}
