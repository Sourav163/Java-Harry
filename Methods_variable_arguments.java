package Java_Harry;

public class Methods_variable_arguments {
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    static int sum(int x, int... arr) {
        int sum = x;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(2, 3, 4));

        System.out.println(add());
        System.out.println(add(1));
        System.out.println(add(2, 3));
        System.out.println(add(4, 5, 6));
    }
}
