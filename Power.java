package Java_Harry;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 8;
        int ans = 1;

        while (power > 0) {
            if ((power & 1) != 0) {
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        System.out.println(ans);
    }
}
