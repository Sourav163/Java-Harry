package Java_Harry;

import java.util.Scanner;

public class Methods_fibonacci_series {
    static void fibonacci(int n, int a, int b) {
        if (n != 0) {
            System.out.print("  " + a + "  " + b);
            a = a + b;
            b = b + a;
            fibonacci(n - 1, a, b);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int x = s.nextInt();
        fibonacci(x, 0, 1);
        s.close();
    }
}
