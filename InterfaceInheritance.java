package Java_Harry;

interface SampleInterface {
    void meth1();

    void meth2();
}

interface ChildSampleInterface extends SampleInterface {
    void meth3();

    void meth4();
}

class SampleClass implements ChildSampleInterface {
    public void meth1() {
        System.out.println("This is method 1.");
    }

    public void meth2() {
        System.out.println("This is method 2.");
    }

    public void meth3() {
        System.out.println("This is method 3.");
    }

    public void meth4() {
        System.out.println("This is method 4.");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
