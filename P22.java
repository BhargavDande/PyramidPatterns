/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
a       
b c     
d e f   
g h i j 
k l m   
n o     
p     */

package pyramidal_patterns;

import java.util.Scanner;

public class P22 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		char ch = 'a';
		for (int r = 1; r <= 2 * n - 1; r++) {

			for (int c = 1; c <= n; c++) {
				if (r + c <= 2 * n && r >= c) {
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
