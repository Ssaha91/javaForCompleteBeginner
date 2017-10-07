package practice3;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        switch (text){
            case "start":
                System.out.println("lets kode java forever");
                break;
            case "stop":
                System.out.println("lets practice java");
                break;
            case "text":
                System.out.println("Selenium is good way to get succcess");
                break;
            default:
                System.out.println("Live in java, sleeep in java , die in java");

        }
    }
}
