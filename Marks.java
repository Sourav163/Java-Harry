package Java_Harry;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Marks Scored in English :  ");
        float m1 = s.nextFloat();
        System.out.println("Marks Scored in Programming :  ");
        float m2 = s.nextFloat();
        System.out.println("Marks Scored in Mathematics :  ");
        float m3 = s.nextFloat();
        System.out.println("Marks Scored in Physics :  ");
        float m4 = s.nextFloat();
        System.out.println("Marks Scored in Chemistry :  ");
        float m5 = s.nextFloat();
        float Total = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total Marks Scored :  " + Total);
        float Percentage = Total / 5;
        System.out.println("Percentage Scored :  " + Percentage + " %");
        s.close();
    }
}