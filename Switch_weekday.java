package Java_Harry;

import java.util.Scanner;

public class Switch_weekday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("This is Monday.");
                break;
            case 2:
                System.out.println("This is Tuesday.");
                break;
            case 3:
                System.out.println("This is Wednesday.");
                break;
            case 4:
                System.out.println("This is Thursday.");
                break;
            case 5:
                System.out.println("This is Friday.");
                break;
            case 6:
                System.out.println("This is Saturday.");
                break;
            case 7:
                System.out.println("This is Sunday.");
                break;
            default:
                System.out.println("INVALID OPTION");
        }
        s.close();
    }
}
