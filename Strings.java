package Java_Harry;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str1 = "CodeWithHarry";
        String str2 = "CodeWithHarry";
        System.out.println(str1 == str2);
        String str3 = new String("Keep coding");
        String str4 = new String("Keep coding");
        System.out.println(str3 == str4);
        String name1 = new String("Harry");
        String name2 = "Harry";
        System.out.print("The name is: ");
        System.out.print(name1);
        System.out.print(name2);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b);
        System.out.format("The value of a is %d and value of b is %f\n", a, b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        // String st1 = sc.next();
        String st2 = sc.nextLine();
        // System.out.println(st1);
        System.out.println(st2);
        sc.close();
    }
}