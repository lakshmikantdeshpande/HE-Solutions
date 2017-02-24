package a_Basics_Of_Programming.a_Basic_Of_Input_Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(factorial(N));

		br = null;
		System.gc();
	}

	private static int factorial(int i) {
		if (i <= 1)
			return i;
		return i * factorial(i - 1);
	}
}