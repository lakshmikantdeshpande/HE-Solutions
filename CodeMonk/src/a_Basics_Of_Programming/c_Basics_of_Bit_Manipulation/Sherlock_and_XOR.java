package a_Basics_Of_Programming.c_Basics_of_Bit_Manipulation;

import java.io.PrintWriter;
import java.util.Scanner;

// Output = number of odd numbers * number of even numbers
// XOR of two odd & even numbers is always odd
public class Sherlock_and_XOR {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int T = scanner.nextInt();

		while (T-- > 0) {
			int N = scanner.nextInt();

			long odd = 0;
			long even = 0;
			long num = 0;
			while (N-- > 0) {
				num = scanner.nextLong();
				if (num % 2 == 0)
					even++;
				else
					odd++;
			}
			out.println(odd * even);
		}
		out.close();
		out = null;
		scanner.close();
		scanner = null;
		System.gc();
	}
}