/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
      1       
    2 2 2     
  3 3 3 3 3   
4 4 4 4 4 4 4               */

package pyramidal_patterns;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		int s = 1;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
					System.out.print(s + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			s++;
		}
	}
}
