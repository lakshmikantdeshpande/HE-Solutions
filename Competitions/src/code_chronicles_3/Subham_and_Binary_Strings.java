package code_chronicles_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subham_and_Binary_Strings {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder strb = new StringBuilder();

		while (T-- > 0) {
			int count = 0;
			int p = Integer.parseInt(br.readLine().trim());
			String str = br.readLine();

			int i = 0;
			while (i != str.length())
				if (str.charAt(i++) == '0')
					count++;

			strb.append(count + "\n");
		}

		System.out.print(strb.toString());

		strb = null;
		br = null;
		System.gc();
	}
}
