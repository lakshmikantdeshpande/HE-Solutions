package a_Basics_Of_Programming.a_Basic_Of_Input_Output;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Magical_Word {
	private static Map<Integer, Boolean> map;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder strb = new StringBuilder();
		map = new HashMap<Integer, Boolean>();

		for (int i = 65; i < 123; i++)
			map.put(i, false);
		map.put(67, true);
		map.put(71, true);
		map.put(73, true);
		map.put(79, true);
		map.put(83, true);
		map.put(89, true);
		map.put(97, true);
		map.put(101, true);
		map.put(103, true);
		map.put(107, true);
		map.put(109, true);
		map.put(113, true);

		char[] array = new char[500];

		while (N-- > 0) {
			int len = Integer.parseInt(br.readLine());
			String line = br.readLine();
			for (int i = 0; i < len; i++)
				array[i] = (char) getPos(line.charAt(i));
			strb.append(new String(array, 0, len) + "\n");
		}
		System.out.print(strb.toString());

		map = null;
		strb = null;
		array = null;
		br = null;
		System.gc();
	}

	// for loop runs 7 times to find nearest prime as max difference between
	// 2 adjacent prime numbers till 120 is 8
	private static int getPos(int c) {
		if (c < 67)
			return 67;
		else if (c > 113)
			return 113;
		else if (map.containsKey(c) && map.get(c))
			return c;
		else {
			int a = c;
			int b = c;
			for (int i = 0; i < 7; i++) {
				--a;
				++b;
				if (map.containsKey(a) && map.get(a))
					return a;
				else if (map.containsKey(b) && map.get(b))
					return b;
			}
		}
		return -1;
	}
}