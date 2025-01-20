package Java_Harry;

import Java_Harry.World.Hello;
import Java_Harry.World.Say.Greet;

public class UsingPackage {
    public static void main(String[] args) {
        System.out.println("This is usingPackage.java");

        Hello h = new Hello();
        System.out.println(h.add(15, 10));

        Greet g = new Greet();
        g.say();
    }
}