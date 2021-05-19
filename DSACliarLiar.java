import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DSACliarLiar {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int [] arr = new int[n+1];
        Arrays.fill(arr,0);
	    for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a]++;
            if(b!=n) arr[b+1]--;
		}
        int [] a = new int [n+1];
        Arrays.fill(a,0);
        a[0] = arr[0];
        int res = -1;
        for(int i =1;i<=n;i++){
            a[i] = a[i-1] + arr[i];
            if(a[i] == i) res = i;
        }
        System.out.print(res);
	}
}
/*There are n people in a circle, numbered from 1 to n, each of whom always tells the truth or always lies.
Each person i makes a claim of the form: “the number of truth-tellers in this circle is between ai and bi, inclusive.”
Compute the maximum number of people who could be telling the truth.
Sample input
3
1 1
2 3
2 2

Sample output 
2

Sample input
8
0 1
1 7
4 8
3 7
1 2
4 5
3 7
1 8

Sample output
-1 */

/*int main() {
  //Your code here
    int test;
    
    scanf("%d",&test);
    int n = test;

    //map<int,int> mp;
    int mp[n+1]={0};
    while(test--)
    {
        int a,b;
        scanf("%d%d",&a,&b);
        mp[a]++;
        if(b != n) mp[b+1]--;
    }

    vector<int> v(n+1, 0);
    v[0] = mp[0];

    int res = -1;
    for(int i=1;i<=n;++i)
    {
        v[i] = v[i-1] + mp[i];
        if(v[i] == i) res = i;
    }

    printf("%d",res);
    return 0;
} */