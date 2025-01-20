package Java_Harry;

import java.util.Scanner;

public class Loop_Multiplication_table_rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = s.nextInt();
        System.out.println("Reverse Multiplication Table Of " + n + " :");
        for (int i = 10; i > 0; i--) {
            System.out.println(n + " * " + i + " =  " + n * i);
        }
        s.close();
    }
}
