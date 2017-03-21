package b_Arrays_and_Strings;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class INCOMPLETEWeighing_the_Stones {
	static Scanner scanner = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = scanner.nextInt();
		Map<Integer, Integer> map1, map2;

		while (N-- > 0) {
			map1 = new TreeMap<Integer, Integer>(Collections.reverseOrder());
			map2 = new TreeMap<Integer, Integer>(Collections.reverseOrder());

			int n = scanner.nextInt();
			int sum1 = 0, sum2 = 0;
			int freq1 = 0, freq2 = 0;
			int weight1 = 0, weight2 = 0;

			for (int i = 0; i < n; i++) {
				int k = scanner.nextInt();
				map1.put(k, map1.get(k) == null ? 0 : map1.get(k) + 1);
				sum1 = Math.max(sum1, k);
			}

			for (int i = 0; i < n; i++) {
				int k = scanner.nextInt();
				map2.put(k, map2.get(k) == null ? 0 : map2.get(k) + 1);
				sum2 = Math.max(sum2, k);
			}

			for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
				if (freq1 != (int) Math.max(freq1, entry.getValue())) {
					freq1 = Math.max(freq1, entry.getValue());
					weight1 = entry.getKey();
				}
			}

			for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
				if (freq2 != (int) Math.max(freq2, entry.getValue())) {
					freq2 = Math.max(freq2, entry.getValue());
					weight2 = entry.getKey();
				}
			}

			System.out.println("FREQ1: " + freq1);
			System.out.println("FREQ2: " + freq2);
			
			if (freq1 > freq2)
				out.println("Rupam");
			else if (freq1 < freq2)
				out.println("Ankit");
			else if (map1.get(sum1) > map2.get(sum2))
				out.println("Rupam");
			else if (map1.get(sum1) < map2.get(sum2))
				out.println("Ankit");
			else
				out.println("Tie");
		}

		scanner.close();
		scanner = null;
		out.close();
		out = null;
		map1 = null;
		map2 = null;
		System.gc();
	}
}