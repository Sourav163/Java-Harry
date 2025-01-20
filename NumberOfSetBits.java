package Java_Harry;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 854;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));
    }

    static int SetBits(int n) {
        int ans = 0;
        /*while (n > 0) {
            ans++;
            n -= n & (-n);
        }*/
        while (n > 0) {
            ans++;
            n &= n - 1;
        }
        return ans;
    }
}
