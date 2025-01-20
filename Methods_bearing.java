package Java_Harry;

import java.util.Scanner;

public class Methods_bearing {
    static int bearing(int x, int y) {
        int a = x * 60 + y;
        int b = 180 * 60;
        int c, d;
        if (a > b) {
            c = (a - b) / 60;
            d = (a - b) % 60;
        } else {
            c = (a + b) / 60;
            d = (a + b) % 60;
        }
        System.out.println("BB of " + x + " Degree " + y + " Minute is  "
                + c + " Degree " + d + " Minute.");
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The FB in Degree :  ");
        int fbd = s.nextInt();
        System.out.print("Enter The FB in Minute :  ");
        int fbm = s.nextInt();
        bearing(fbd, fbm);
        s.close();
    }
}
