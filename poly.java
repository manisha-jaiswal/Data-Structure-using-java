import java.util.*;
class poly{ 
	static int max(int m, int n) { 
		return (m > n) ? m : n; 
	} 
	static int[] add(int A[], int B[], int m, int n) { 
		int size = max(m, n); 
		int sum[] = new int[size]; 
		for (int i = 0; i < m; i++) { 
			sum[i] = A[i]; 
		} 
		for (int i = 0; i < n; i++) { 
			sum[i] += B[i]; 
		} 
		return sum; 
	} 
		static void printPoly(int poly[], int n) { 
		for (int i = 0; i < n; i++) { 
			System.out.print(poly[i]); 
			if (i != 0) { 
				System.out.print("x^" + i); 
			} 
			if (i != n - 1) { 
				System.out.print(" + "); 
			} 
		} 
	} 
		public static void main(String[] args) { 
		
		int A[] = {5, 0, 10, 6}; 
		int B[] = {1, 2, 4}; 
		int m = A.length; 
		int n = B.length; 
		System.out.println("First polynomial is"); 
		printPoly(A, m); 
		System.out.println("\nSecond polynomial is"); 
		printPoly(B, n); 
		int sum[] = add(A, B, m, n); 
		int size = max(m, n); 
		System.out.println("\nsum polynomial is"); 
		printPoly(sum, size); 

	} 
} 
