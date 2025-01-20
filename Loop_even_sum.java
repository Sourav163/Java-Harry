package Java_Harry;

import java.util.Scanner;

public class Loop_even_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The number :");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + 2 * i;
        }
        System.out.println("Sum of 1st " + n + " Even no. is  " + sum);
        s.close();
    }
}
