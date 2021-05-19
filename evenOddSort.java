import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void oddEvenSort(int a[], int n){
        int nEven = 0, nOdd=0;
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                nEven++;
            }else{
                nOdd++;
            }
        }
        int odd[] = new int[nOdd];
        int even[] = new int[nEven];
        int e=0, o=0;
        for(int i=0; i<n; i++){
            if(a[i]%2 == 0){
                even[e]= a[i];
                e++;
            }else{
                odd[o]=a[i];
                o++;
            }
        }
        for(int i=nOdd-1; i>=0; i--){
            System.out.print(odd[i]+ " ");
        }
        for(int i=0; i<nEven; i++){
            System.out.print(even[i]+ " ");
        }
        System.out.println();

    }

    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[]= new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int m =l+ (r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }

	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
        a[i]=sc.nextInt();
        }
        mergeSort(a,0,n-1);
        oddEvenSort(a,n);
	}
}