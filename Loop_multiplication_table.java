package Java_Harry;

import java.util.Scanner;

public class Loop_multiplication_table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = s.nextInt();
        System.out.println("Multiplication Table Of " + n + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " =  " + n * i);
        }
        s.close();
    }
}
