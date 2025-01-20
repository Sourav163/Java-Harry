package Java_Harry;

// 1. Create three classes Calculator, ScCalculator and HybridCalculator and group them into package :
// package Calcs;

// class Calculator {
//     public void calc() {
//         System.out.println("This is Calculator :)");
//     }
// }

// class ScCalculator {
//     public void scalc() {
//         System.out.println("This is ScCalculator :)");
//     }
// }

// class HybridCalculator {
//     public void hcalc() {
//         System.out.println("This is HybridCalculator :)");
//     }
// }

// 2. Use a built-in package in java to write a class which displays a
// message(by using sout) after taking input from the user :

// 3. Create a package in class with three package levels folder, folderL1,
// folderL2
// package folder.folderL1.folderL2;

public class PracticeSet_12 {
    public static void main(String[] args) {
        // 1.
        // Calculator c = new Calculator();
        // c.calc();
        // ScCalculator sc = new ScCalculator();
        // sc.scalc();
        // HybridCalculator hc = new HybridCalculator();
        // hc.hcalc();

        // 2.
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter input to be displayed :  ");
        String ip = scan.nextLine();
        System.out.println("\n" + ip);
    }
}