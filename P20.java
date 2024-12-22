/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
1       
1 2     
1 2 3   
1 2 3 4 
1 2 3   
1 2     
1         */

package pyramidal_patterns;

import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			int s = 1;
			for (int c = 1; c <= n; c++) {

				if (r + c <= 2 * n && r >= c) {
					System.out.print(s + " ");
					s++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
