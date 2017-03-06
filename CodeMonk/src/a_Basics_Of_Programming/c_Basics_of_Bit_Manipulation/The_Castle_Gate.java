package a_Basics_Of_Programming.c_Basics_of_Bit_Manipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class The_Castle_Gate {
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) {
		int T = 0, N = 0, count = 0, i = 0, j = 0;
		try {
			T = Integer.parseInt(br.readLine());
		} catch (IOException io) {
		}

		while (T-- > 0) {
			try {
				N = Integer.parseInt(br.readLine());
			} catch (IOException io) {
			}
			count = 0;
			for (i = 1; i < N; i++)
				for (j = i + 1; j <= N; j++)
					if ((i ^ j) <= N)
						count++;
			out.println(count);
		}
		out.flush();

		out = null;
		br = null;
		System.gc();
	}
}