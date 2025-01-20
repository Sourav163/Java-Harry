package Java_Harry;

import java.util.Scanner;

public class Methods_recursion_factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number :  ");
        int x = s.nextInt();
        System.out.println("Factorial of " + x + " is  " + fact(x));
        s.close();
    }
}
