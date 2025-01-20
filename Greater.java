package Java_Harry;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        float i = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number :");
        float a = s.nextFloat();
        System.out.println(i > a);
        s.close();
    }
}
