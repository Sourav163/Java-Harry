package Java_Harry;

import java.util.Scanner;

public class Else_if_tax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Salary Amount :");
        int a = s.nextInt();
        if (a <= 250000) {
            System.out.println("No Tax");
        } else if (a > 250000 && a <= 500000) {
            float tax = 0.05f * (a - 250000);
            System.out.println("Tax Amount :  " + tax);
        } else if (a > 500000 && a <= 1000000) {
            float tax = 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (a - 500000);
            System.out.println("Tax Amount :  " + tax);
        } else if (a > 1000000) {
            float tax = 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (1000000 - 500000);
            tax = tax + 0.3f * (a - 1000000);
            System.out.println("Tax Amount :  " + tax);
        }
        s.close();
    }
}