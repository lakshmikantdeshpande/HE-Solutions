package a_Basics_Of_Programming.a_Basic_Of_Input_Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count_Divisors {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());

		int i = Integer.parseInt(str.nextToken());
		int j = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());

		if (m == 1)
			System.out.println(j - i + 1);
		else {
			int counter = 0;
			for (int p = i; p <= j; p++) {
				if (p % m == 0)
					counter++;
			}
			System.out.println(counter);
		}

		str = null;
		br = null;
		System.gc();
	}
}