package Java_Harry.World;

class C1 {
    public int x = 10;
    protected int y = 20;
    int z = 30; // default
    private int a = 40;

    public void method1() {
        System.out.println("Access Level :  Class");
        System.out.println("public int x = " + x);
        System.out.println("protected int y = " + y);
        System.out.println("default int z = " + z);
        System.out.println("private int a = " + a);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.method1();

        System.out.println("\nAccess Level :  Package");
        System.out.println("public int x = " + c1.x);
        System.out.println("protected int y = " + c1.y);
        System.out.println("default int z = " + c1.z);
        // System.out.println("private int a = " + c1.a); --> Not Accessible (private)
    }
}
