package a_Basics_Of_Programming.b_Basics_of_Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jarvis_and_Seven_Segments {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String line = br.readLine();
		int N = Integer.parseInt(br.readLine());
		StringBuilder strb = new StringBuilder();
		StringTokenizer str = null;
		int[] index = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		
		while (N-- > 0) {
			br.readLine();
			str = new StringTokenizer(br.readLine());
			int lowest = Integer.MAX_VALUE;
			int lowestnum = 0;

			while (str.hasMoreTokens()) {
				String line = str.nextToken();
				int num = Integer.parseInt(line);
				int sum = 0;
				for (int i = 0; i < line.length(); i++) {
					sum += index[line.charAt(i) - '0'];
				}
				if (sum < lowest) {
					lowest = sum;
					lowestnum = num;
				}
			}
			strb.append(lowestnum + "\n");
		}
		System.out.print(strb.toString());

		strb = null;
		str = null;
		br = null;
		System.gc();
	}
}