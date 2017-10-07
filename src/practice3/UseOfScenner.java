package practice3;

import java.util.Scanner;

public class UseOfScenner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");

        String name = input.nextLine();
        System.out.println("you have entered " + name);

        System.out.println("Enter your number : ");

        int myNum = input.nextInt();
        System.out.println("you have entered " + myNum);
    }
}
