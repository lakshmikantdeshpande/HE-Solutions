package adhoc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Furthest_Vertex {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		WeightedQuickUnion wqupc = new WeightedQuickUnion(scanner.nextInt() + 1);
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int type = scanner.nextInt();
			switch (type) {
			case 1:
				wqupc.union(scanner.nextInt(), scanner.nextInt());
				break;
			case 2:
				pw.println(wqupc.hops(scanner.nextInt()));
				break;
			}
		}

		scanner.close();
		pw.close();
		System.gc();
		wqupc = null;
	}

}

class WeightedQuickUnion {
	private int[] id;
	private int[] size; // to store component size

	public WeightedQuickUnion(int N) {
		id = new int[N];
		size = new int[N];
		// initialize id elements with itself (individual components)
		// initialize component sizes to 1
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 0;
		}
	}

	private int root(int n) {
		while (id[n] != n)
			n = id[n];
		return n;
	}

	public int hops(int i) {
		return size[root(i)];
	}

	private boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int pid = root(p);
		int qid = root(q);
		if (pid == qid)
			return;
		else {
			size[p] += size[q];
			id[qid] = pid;
		}
	}
}