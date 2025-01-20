package Java_Harry;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 32;
        boolean a = (n & (n - 1)) == 0;
        System.out.println(a);
    }
}
