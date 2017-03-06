package a_Basics_Of_Programming.c_Basics_of_Bit_Manipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Xor_Is_Mad {
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String args[]) {
		StringBuilder strb = new StringBuilder();
		int T = 0, N = 0, count = 0;
		try {
			T = Integer.parseInt(br.readLine());
		} catch (IOException io) {
		}

		while (T-- > 0) {
			try {
				N = Integer.parseInt(br.readLine());
			} catch (IOException io) {
			}
			count = 1;
			// while (N != 0) {
			// if (N % 2 == 0)
			// count *= 2;
			// N /= 2;
			// }

			while (N != 0) {
				if ((N & 1) == 0)
					count *= 2;
				// N /= 2;
				N >>= 1;
			}

			strb.append(--count + "\n");
		}
		System.out.print(strb.toString());
		strb = null;
		br = null;
		System.gc();
	}
}