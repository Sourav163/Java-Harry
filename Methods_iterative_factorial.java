package Java_Harry;

import java.util.Scanner;

public class Methods_iterative_factorial {
    static int fact(int n) {
        int p = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                p *= i;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number :  ");
        int x = s.nextInt();
        System.out.println("Factorial of " + x + " is  " + fact(x));
        s.close();
    }

}
