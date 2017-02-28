package a_Basics_Of_Programming.b_Basics_of_Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game_Of_XOR {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			int size = Integer.parseInt(br.readLine());
			for (int i = 0; i < size; i++) {
				for (int j = i; j < size; j++) {
					
//					for (int k = i; k <= j; k++) 
				}
			}
		}

		br = null;
		System.gc();
	}
}