package Java_Harry;

import java.util.Scanner;

public class Methods_recursion_sum {
    static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursion(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Natural Number :  ");
        int x = s.nextInt();
        System.out.println("Sum of natural numbers upto " + x + " =  " + recursion(x));
        s.close();
    }
}
