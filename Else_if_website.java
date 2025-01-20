package Java_Harry;

import java.util.Scanner;

public class Else_if_website {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Website URL :");
        String st = s.next();
        if (st.endsWith(".com")) {
            System.out.println("This is a Commercial Website.");
        } else if (st.endsWith(".org")) {
            System.out.println("This is an Organizational Website.");
        } else if (st.endsWith(".in")) {
            System.out.println("This is an Indian Website.");
        }
        s.close();
    }
}
