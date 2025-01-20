package Java_Harry;

public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int x = 7;
        int y = 2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(x++);
        System.out.println(y--);
        // int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int n = 9;
        n *= 3;
        System.out.println(n);

        // 3. Comparison Operators
        System.out.println(64 < 6);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        // 4. Logical Operators
        System.out.println(64 > 5 && 64 > 98);
        // System.out.println(64>5 || 64>98);
        System.out.println(64 > 5);
        System.out.println(x < y && x != y);
        System.out.println(x < y || x == y);
        System.out.println(!(x < y && x == y));

        // 5. Bitwise Operators
        System.out.println(2 & 3);
        int a = 2, b = 3;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(13 << 2);
        System.out.println(13 >> 2);
        // 10
        // 11
        // ----
        // 10
    }
}