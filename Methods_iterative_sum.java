package Java_Harry;

import java.util.Scanner;

public class Methods_iterative_sum {
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number :  ");
        int x = s.nextInt();
        System.out.println("Sum Of 1st " + x + " Natural Numbers is  " + sum(x));
        s.close();
    }
}