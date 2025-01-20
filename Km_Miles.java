package Java_Harry;

import java.util.Scanner;

public class Km_Miles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Distance in KM. :");
        float km = s.nextFloat();
        double mile = (double) Math.round(km * 0.62137119 * 100) / 100;
        System.out.println(km + " Kilometers = " + mile + " Miles");
        s.close();
    }
}
