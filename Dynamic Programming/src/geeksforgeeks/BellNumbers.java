package geeksforgeeks;

public class BellNumbers {
//  the value of nth bell number is the sum of S(n,k) for k=1 to n where 
//  S(n,k) be total number of partition of n elements into k sets
//  Solution to this problem is found out by creating a bell traingle and getting solution from there;	
//  Bell(n,k)  calculates the number of partitions of the set(1,2,3,...n+1) in which the element k+1 is the largest
//  singleton element i.e(largest number that can be alone in the set)
	
	public static int solution(int n) {
		int[][] bell_triangle = new int[n+1][n+1];
		bell_triangle[0][0] = 1;
		for(int i=1 ; i<=n; i++) {
			bell_triangle[i][0] = bell_triangle[i-1][i-1];
			
			for(int j = 1; j<=i ;j++) {
				bell_triangle[i][j] = bell_triangle[i][j-1] + bell_triangle[i-1][j-1];
			}
		}
		return bell_triangle[n][0];
	}
	public static void main(String[] args) {
		int number = 5;
		System.out.println(solution(number));
	}
}
