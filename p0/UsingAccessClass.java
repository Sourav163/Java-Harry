package Java_Harry.p0;

import Java_Harry.p.AccessClass;

public class UsingAccessClass {
    public static void main(String[] args) {
        AccessClass ac = new AccessClass();
        System.out.println("Access Level :  World");
        System.out.println("public int x = " + ac.x);
        // System.out.println("protected int y = " + ac.y); --> Not Accessible
        // System.out.println("default int z = " + ac.z); --> Not Accessible
        // System.out.println("private int a = " + ac.a); --> Not Accessible
    }
}
