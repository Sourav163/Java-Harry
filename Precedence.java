package Java_Harry;

public class Precedence {
    public static void main(String[] args) {
        // Precedence & Associativity

        int a = 6 * 5 - 34 / 2;
        /*
         * Highest precedence goes to * and /. They are then evaluated on the basis
         * of left to right associativity
         * =30-34/2
         * =30-17
         * =13
         */
        int b = 60 / 5 - 34 * 2;
        /*
         * = 12-34*2
         * =12-68
         * =-56
         */

        System.out.println(a);
        System.out.println(b);

        // Quick Quiz
        int x = 6;
        int y = 1;
        int k = x * y / 2;
        System.out.println(k);

        int m = 0;
        int n = 0;
        int o = 10;
        int l = m * m - (4 * n * o) / (2 * o);
        System.out.println(l);
        float ft1 = 7 / 4 * 9 / 2;
        System.out.println("ft1 = " + ft1);
        float ft2 = 7 / 4.0f * 9 / 2.0f;
        System.out.println("ft2 = " + ft2);
        int i = 7 * 49 / 7 + 35 / 7;
        System.out.println("i = " + i);
    }
}