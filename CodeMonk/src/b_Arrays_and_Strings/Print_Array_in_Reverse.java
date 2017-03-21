package b_Arrays_and_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

public class Print_Array_in_Reverse {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String args[]) throws Exception {
		int N = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<String>();
		while (N-- > 0) {
			stack.push(br.readLine());
		}
		while (!stack.isEmpty()) {
			pw.println(stack.pop());
		}

		stack = null;
		pw.close();
		pw = null;
		br = null;
		System.gc();
	}
}