package Java_Harry;

public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println("Can't Divide, Reason :  " + e);
        }
    }
}
