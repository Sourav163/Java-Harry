package Java_Harry;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        // Encrypting The grade By 8 :
        System.out.println("After Encryption :");
        grade += 8;
        System.out.println("Grade = " + grade);
        // Decrypting The grade By 8 :
        System.out.println("After Decryption :");
        grade -= 8;
        System.out.println("Grade = " + grade);
    }
}
