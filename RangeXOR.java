package Java_Harry;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(xor(b) ^ xor(a - 1));
        // Time Limit Exceed error for large numbers...
        int ans = 0;
        for (int i = 3; i <= 9; i++) {
            ans ^= i;
        }
        System.out.println(ans);
    }

    static int xor(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}
