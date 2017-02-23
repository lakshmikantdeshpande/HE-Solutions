package a_Basics_Of_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Toggle_String {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringBuilder strb = new StringBuilder();

		for (int i = 0; i < line.length(); i++) {
			char x = line.charAt(i);
			if (Character.isUpperCase(x))
				strb.append(Character.toLowerCase(x));
			else
				strb.append(Character.toUpperCase(x));
		}
		System.out.println(strb.toString());

		strb = null;
		line = null;
		br = null;
		System.gc();
	}
}