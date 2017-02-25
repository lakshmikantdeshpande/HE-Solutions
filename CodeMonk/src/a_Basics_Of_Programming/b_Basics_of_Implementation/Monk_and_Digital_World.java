package a_Basics_Of_Programming.b_Basics_of_Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Monk_and_Digital_World {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final short len = Short.parseShort(br.readLine());
		short i = 0;
		short[] hash1 = new short[26];
		short[] hash2 = new short[26];

		while (i < len) {
			hash1[(short) br.read() - 97]++;
			i++;
		}
		i = 0;
		br.read();
		while (i < len) {
			hash2[(short) br.read() - 97]++;
			i++;
		}

		for (i = 0; i < 26; i++)
			if (hash1[i] != hash2[i]) {
				System.out.println("NO");
				return;
			}

		System.out.println("YES");

		hash1 = null;
		hash2 = null;
		br = null;
		System.gc();
	}
}