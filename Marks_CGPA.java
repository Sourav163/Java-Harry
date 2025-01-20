package Java_Harry;

import java.util.Scanner;

public class Marks_CGPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Marks Scored in Physics :");
        float m1 = s.nextFloat();
        System.out.println("Marks Scored in Chemistry :");
        float m2 = s.nextFloat();
        System.out.println("Marks Scored in Mathematics :");
        float m3 = s.nextFloat();
        float Total = m1 + m2 + m3;
        System.out.println("Total Marks Secured :  " + Total);
        float Percentage = Total / 3;
        System.out.println("Percentage Scored :  " + Percentage + " %");
        double CGPA = Percentage / 9.5;
        System.out.println("CGPA Scored :  " + CGPA);
        s.close();
    }
}