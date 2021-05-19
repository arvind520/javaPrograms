public class DSACSamePair {
    
}
/*
Given an array Arr of N integers. Solve the following problem for X from 1 to N :-
Find the number of ways to select a pair (i, j) such that i < j and i != X and j != X and Arr[i] = Arr[j].
Sample Input
5
4 4 1 1 1 

Sample Output
3 3 2 2 2 

Explanation:
For X=1 we have (3, 4) (3, 5) (4, 5)
For X=2 we have (3, 4) (3, 5) (4, 5)
For X=3 we have (1, 2) (4, 5)
For X=4 we have (1, 2) (3, 5)
For X=5 we have (1, 2) (3, 4)
 */


 /*
 public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      Map<Integer, Integer> map = new HashMap<>();
                      int arr[] = new int[n];
                      long totalPairs = 0L;
                      for(int i = 0 ; i < n ; i++){
                          int temp = sc.nextInt();
                          arr[i] = temp;
                          if(map.containsKey(temp)){
                              totalPairs += map.get(temp);
                              map.put(temp, map.get(temp)+1);
                              
                          }else{
                              map.put(temp, 1);
                          }
                      }
                      for(int i = 0 ; i < n ; i++){
                        int val = map.get(arr[i]) -1;
                        System.out.print(totalPairs-val+" ");
                      }

	}
 */