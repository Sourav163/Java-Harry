package Java_Harry;

public class OddEven {
    public static void main(String[] args) {
        int a = 67;
        System.out.println(isOdd(a));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
