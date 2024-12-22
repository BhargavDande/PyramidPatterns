/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
4 3 2 1 2 3 4 
  3 2 1 2 3   
    2 1 2     
      1                */

package pyramidal_patterns;

import java.util.Scanner;

public class P23 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value :");
		int n = ip.nextInt();
		int s = n;
		for (int r = 1; r <= n; r++) {
			int a = s;
			for (int c = 1; c <= 2 * n - 1; c++) {

				if (c >= r && r + c <= 2 * n) {
					if (c < n) {
						System.out.print(a + " ");
						a--;
					} else {
						System.out.print(a + " ");
						a++;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			s--;
		}
	}
}
