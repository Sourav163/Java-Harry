package Java_Harry;

public class Resulting_datatype {
    public static void main(String[] args) {
        char ch = 'a';
        int a = 10;
        System.out.println(a + ch);
        byte x = 5;
        int y = 6;
        short z = 8;
        int b = y + z;
        float c = 6.54f + x;
        System.out.println(b);
        System.out.println(c);

        // Increment and Decrement Operators
        int i = 56;
        int d = i++; // first d is assigned i (56) then 'i' is incremented
        System.out.println(d);
        int j = 67;
        int e = ++j; // first j is incremented then e is assigned j (68)
        System.out.println(e);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int u = 7;
        System.out.println(++u * 8);
        char chr = 'a';
        System.out.println(++chr);
    }
}
