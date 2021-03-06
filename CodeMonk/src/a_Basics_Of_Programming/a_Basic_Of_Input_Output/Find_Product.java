package a_Basics_Of_Programming.a_Basic_Of_Input_Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Find_Product {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		long answer = 1;
		long x = (long) (Math.pow(10, 9) + 7);

		StringTokenizer str = new StringTokenizer(br.readLine());
		while (str.hasMoreTokens()) {
			answer = (answer * Long.parseLong(str.nextToken()) % x) % x;
		}

		System.out.println(answer);
		str = null;
		br = null;
		System.gc();
	}
}