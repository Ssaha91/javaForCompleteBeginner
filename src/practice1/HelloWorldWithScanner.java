package practice1;

import java.util.Scanner;

public class HelloWorldWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter ur name: ");
        String value = sc.nextLine();
        System.out.println(value);
        System.out.println("How are you Mr." + value + "?");

    }
}
