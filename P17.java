/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
a b c d c b a 
  a b c b a   
    a b a     
      a              */

package pyramidal_patterns;

import java.util.Scanner;

public class P17 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();

		for (int r = 1; r <= n; r++) {
			char ch = 'a';
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (c >= r && r + c <= 2 * n) {
					if (c < n) {
						System.out.print(ch + " ");
						ch++;
					} else {
						System.out.print(ch + " ");
						ch--;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
