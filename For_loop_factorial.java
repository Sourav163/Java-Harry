package Java_Harry;

import java.util.Scanner;

public class For_loop_factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " =  " + fact);
        s.close();
    }
}
