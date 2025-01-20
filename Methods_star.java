package Java_Harry;

public class Methods_star {
    static void star_inc(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    static void star_dec(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x = 4;
        star_inc(x);
        System.out.println("\n");
        star_dec(x);
    }
}
