package a_Basics_Of_Programming.a_Basic_Of_Input_Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Roy_and_Profile_Picture {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = null;
		StringBuilder strb = new StringBuilder();

		final int L = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			str = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(str.nextToken());
			int H = Integer.parseInt(str.nextToken());

			if (W < L || H < L)
				strb.append("UPLOAD ANOTHER" + "\n");
			else {
				if (W == H)
					strb.append("ACCEPTED" + "\n");
				else
					strb.append("CROP IT" + "\n");
			}
		}
		System.out.print(strb.toString());

		strb = null;
		str = null;
		br = null;
		System.gc();
	}
}