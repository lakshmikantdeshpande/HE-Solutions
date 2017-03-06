package a_Basics_Of_Programming.c_Basics_of_Bit_Manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Count_The_Bits {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count = 0;
		StringBuilder strb = new StringBuilder();

		while (T-- > 0) {
			count = 0;
			int N = Integer.parseInt(br.readLine());

			while (N != 0) {
				N = N & (N - 1);
				count++;
			}
			strb.append(count + "\n");
		}

		System.out.print(strb.toString());

		strb = null;
		br = null;
		System.gc();
	}
}