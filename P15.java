/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
      a       
    b a b     
  c b a b c   
d c b a b c d              */

package pyramidal_patterns;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		char ch = 'a';
		for (int r = 1; r <= n; r++) {
			char a = ch;
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r + c >= n + 1 && c - r <= n - 1) {
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
			ch++;
		}
	}
}
