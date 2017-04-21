package CodeMonk_Bit_Manipulation;

import java.io.PrintWriter;
import java.util.Scanner;

class Monk_and_his_Father {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int count = 0;
            long num = scanner.nextLong();
            while (num > 0) {
                count += (num % 2);
                num /= 2;
            }
            pw.println(count);
        }

        scanner.close();
        scanner = null;
        pw.close();
        pw = null;
        System.gc();
    }
}