package Java_Harry;

public class String_detect {
    public static void main(String[] args) {
        String name = "S  oura   v";
        System.out.println("Double Spaces are present at Index No. :");
        System.out.println(name.indexOf("  "));
        System.out.println("Triple Spaces are present at Index No. :");
        System.out.println(name.indexOf("   "));
    }
}
