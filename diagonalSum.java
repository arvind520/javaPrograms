import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class diagonalSum {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			int b[]=new int[n];
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					a[i][j]=sc.nextInt();
					if(a[i][j]==1){
                        for(int k=0; k<m; k++){
                            System.out.print(1+" ");
                        }
                    }else{
                        System.out.print(0+" ");
                    }
				}
                System.out.println();
			}
			// for(int i=0; i<n; i++){
			// 	for(int j=0; j<m; j++){
			// 		if(a[i][j]==1){
			// 			for(int k=0; k<m; k++){
			// 				a[i][k]=1;
			// 			}
			// 			break;
			// 		}
			// 	}
			// }
			// for(int i=0; i<n; i++){
			// 	if(b[i]==1){
			// 		for(int j=0; j<m; j++){
			// 			System.out.print(1+" ");
			// 		}
			// 	}else{
			// 		for(int j=0; j<m; j++){
			// 			System.out.print(0+" ");
			// 		}
			// 	}
			// 	System.out.println();
			// }
		}
	}
}
