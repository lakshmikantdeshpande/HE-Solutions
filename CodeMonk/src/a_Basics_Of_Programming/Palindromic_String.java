package a_Basics_Of_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromic_String {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String line = br.readLine();
		int len = line.length() - 1;
		int i = 0;
		boolean flag = false;

		while (i < len) {
			if (line.charAt(i) != line.charAt(len)) {
				System.out.println("NO");
				flag = true;
				break;
			}
			i++;
			len--;
		}
		if (!flag)
			System.out.println("YES");

		br = null;
		System.gc();
	}
}