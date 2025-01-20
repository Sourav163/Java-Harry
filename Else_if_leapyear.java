package Java_Harry;

import java.util.Scanner;

public class Else_if_leapyear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Year :");
        int y = s.nextInt();
        if (y % 400 == 0) {
            System.out.println(y + " is a Leap Year.");
        } else if (y % 100 != 0 && y % 4 == 0) {
            System.out.println(y + " is a Leap Year.");
        } else {
            System.out.println(y + " is not a Leap Year.");
        }
        s.close();
    }
}
