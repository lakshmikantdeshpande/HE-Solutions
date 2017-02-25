package a_Basics_Of_Programming.b_Basics_of_Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Count_Digits {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int[] array = new int[10];
		StringBuilder strb = new StringBuilder();

		for (int i = 0; i < line.length(); i++)
			array[Character.getNumericValue(line.charAt(i))]++;

		for (int i = 0; i < array.length; i++)
			strb.append(i + " " + array[i] + "\n");

		System.out.print(strb.toString());
		array = null;
		strb = null;
		br = null;
		System.gc();
	}
}