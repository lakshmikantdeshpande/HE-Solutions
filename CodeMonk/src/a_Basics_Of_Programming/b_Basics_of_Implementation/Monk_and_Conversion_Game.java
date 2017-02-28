package a_Basics_Of_Programming.b_Basics_of_Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Monk_and_Conversion_Game {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer str = null;
		int[] array1 = new int[1000];
		int[] array2 = new int[1000];
		StringBuilder strb = new StringBuilder();

		while (N-- > 0) {
			int i = 0;
			int n = Integer.parseInt(br.readLine());
			str = new StringTokenizer(br.readLine());

			while (str.hasMoreTokens())
				array1[i++] = Integer.parseInt(str.nextToken());
			i = 0;
			str = new StringTokenizer(br.readLine());
			while (str.hasMoreTokens())
				array2[i++] = Integer.parseInt(str.nextToken());

			for (i = 0; i < n - 1; i++) {
				if (array1[i] == array2[i])
					continue;
				else if (array1[i] > array2[i]) {
					array1[i + 1] += array1[i] - array2[i];
					array1[i] = array2[i];
				} else {
					array1[i + 1] -= array2[i] - array1[i];
					array1[i] = array2[i];
				}

			}
			if (array1[n - 1] == array2[n - 1])
				strb.append("YES\n");
			else
				strb.append("NO\n");
		}

		System.out.print(strb.toString());

		array2 = null;
		array1 = null;
		strb = null;
		str = null;
		br = null;
		System.gc();
	}
}