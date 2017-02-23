package a_Basics_Of_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InputOutput {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()) * 2;
		String line = br.readLine();
		System.out.println(N + "\n" + line);
	}
}