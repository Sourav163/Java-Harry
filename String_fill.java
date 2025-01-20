package Java_Harry;

public class String_fill {
    public static void main(String[] args) {
        String name = "Sourav";
        String letter = "Dear <|name|>, Thanks a lot.";
        System.out.println(letter.replace("<|name|>", name));
        System.out.println(letter.replace("<|name|>", "Sourav"));
    }
}
