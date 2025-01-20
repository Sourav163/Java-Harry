package Java_Harry;

// import java.util.*;
// import java.util.Scanner;

public class BuiltInPackage {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Given Number :  " + a);
        sc.close();
    }
}
