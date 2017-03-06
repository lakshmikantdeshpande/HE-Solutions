package a_Basics_Of_Programming.c_Basics_of_Bit_Manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Jarvis_and_Lone_Integer {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine()) - 1;
			String[] array = br.readLine().trim().split(" "); 
			long value = Long.parseLong(array[0]);
			for (int i = 1; i < N; i++)
				value ^= Long.parseLong(array[i]);
			
			if (value != 0)
				out.println(value);
			else
				out.println(-1);
		}
		out.flush();
		out = null;
		System.gc();
	}
}