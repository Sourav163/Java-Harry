package Java_Harry;

import java.util.Scanner;

public class Methods_average {
    static int average(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] marks = new int[5];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks Scored in Subject_" + (i + 1) + " :  ");
            marks[i] = s.nextInt();
        }
        System.out.println("Your Average Mark :  " + average(marks));
        s.close();
    }
}
