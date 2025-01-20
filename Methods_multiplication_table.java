package Java_Harry;

import java.util.Scanner;

public class Methods_multiplication_table {
    static void multi_table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number :  ");
        int x = s.nextInt();
        multi_table(x);
        s.close();
    }
}
