package Java_Harry;

import java.util.Scanner;

public class If_else_result {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Marks Scored in Physics :");
        float m1 = s.nextInt();
        System.out.println("Marks Scored in Chemistry :");
        float m2 = s.nextInt();
        System.out.println("Marks Scored in Mathematics :");
        float m3 = s.nextInt();
        float total = m1 + m2 + m3;
        System.out.println("Total Marks Scored :  " + total);
        float percentage = total / 3;
        System.out.println("Percentage Scored :  " + percentage + " %");
        if (m1 >= 33 && m2 >= 33 && m3 >= 33 && percentage >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        s.close();
    }
}
