package Java_Harry;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 1500;
        int b = 8;
        int numberOfDigits = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(numberOfDigits);
    }
}
