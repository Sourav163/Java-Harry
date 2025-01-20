package Java_Harry;

public class RevNum {
    public static void main(String[] args) {
        int n = 123, rem, rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rem + rev * 10;
            n /= 10;
        }
        System.out.println(rev);
    }
}
