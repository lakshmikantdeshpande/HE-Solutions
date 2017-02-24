package a_Basics_Of_Programming.a_Basic_Of_Input_Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Life_the_Universe_and_Everything {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = 0;

		while ((N = Integer.parseInt(br.readLine())) != 42) {
			stringBuilder.append(N + "\n");
		}
		System.out.print(stringBuilder.toString());

		stringBuilder = null;
		br = null;
		System.gc();
	}
}