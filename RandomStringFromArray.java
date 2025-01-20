package Java_Harry;

import java.util.Random;

public class RandomStringFromArray {
    public static void main(String[] args) {
        String[] arr = {"rock", "paper", "scissor"};
        Random r = new Random();
        int rn = r.nextInt(arr.length);
        String a = arr[rn];
        System.out.println(a);
    }
} 