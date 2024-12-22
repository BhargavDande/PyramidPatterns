/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
      a 
    a b 
  a b c 
a b c d 
  a b c 
    a b 
      a      */

package pyramidal_patterns;

import java.util.Scanner;

public class P21 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			char ch = 'a';
			for (int c = 1; c <= n; c++) {

				if (r - c <= n - 1 && r + c >= n + 1) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}
}
