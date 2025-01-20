package Java_Harry;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String st = s.nextLine();
        System.out.println("Hello " + st + "! Have A Good Day.");
        s.close();
    }
}
