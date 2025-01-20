package Java_Harry;

import java.util.Scanner;

public class Methods_Conversion_temperature {
    static float conversion(float n) {
        return n * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Temperature In Celsius :  ");
        float c = s.nextFloat();
        System.out.print("Fahrenheit Temperature of " + c + " is  " + conversion(c));
        s.close();
    }
}
