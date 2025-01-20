package Java_Harry;

class A {
    public void method() {
        System.out.println("I am the method of class A");
    }
}

class B extends A {
    @Override
    public void method() {
        System.out.println("I am the method of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method();
        b.method();
    }
}
