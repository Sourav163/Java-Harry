package Java_Harry;

public class Loop_multiplication_table_sum {
    public static void main(String[] args) {
        int sum = 0;
        int m = 0;
        for (int i = 1; i <= 10; i++) {
            m = 8 * i;
            sum = sum + m;
        }
        System.out.println("Sum Of Multiplication Table of 8 =  " + sum);
    }
}
