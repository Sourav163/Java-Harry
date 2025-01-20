package Java_Harry;

import java.util.Random;
import java.util.Scanner;

public class Loop_rock_paper_scissor {
    public static void main(String[] args) {
        int nc = 0, ny = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nSet The Number of Rounds :  ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nROCK = 0, PAPER = 1, SCISSOR = 2");

            System.out.print("\nEnter Your Choice :  ");
            int a = sc.nextInt();

            Random r = new Random();
            int b = r.nextInt(3);
            System.out.println("\nComputer's Choice :  " + b + "\n");

            System.out.print("\t");

            if (a == b) {
                System.out.println("TIE");
                nc += 1;
                ny += 1;
            } else if (a == 0 && b == 1) {
                System.out.println("YOU LOSE");
                nc += 1;
            } else if (a == 1 && b == 0) {
                System.out.println("YOU WON");
                ny += 1;
            } else if (a == 1 && b == 2) {
                System.out.println("YOU LOSE");
                nc += 1;
            } else if (a == 2 && b == 1) {
                System.out.println("YOU WON");
                ny += 1;
            } else if (a == 2 && b == 0) {
                System.out.println("YOU LOSE");
                nc += 1;
            } else if (a == 0 && b == 2) {
                System.out.println("YOU WON");
                ny += 1;
            } else {
                System.out.println("INVALID");
            }
        }

        System.out.print("\n");

        if (nc > ny) {
            System.out.println("YOU LOSE THE MATCH BY " + (nc - ny) + " ROUNDS.");
        } else if (ny > nc) {
            System.out.println("YOU WON THE MATCH BY " + (ny - nc) + " ROUNDS.");
        } else if (nc == ny) {
            System.out.println("THE MATCH IS TIE");
        }
        sc.close();
    }
}
