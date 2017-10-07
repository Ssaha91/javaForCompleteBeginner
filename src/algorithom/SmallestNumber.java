package algorithom;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Plese enter some numbers : ");
        double smallest = sc.nextDouble();
        while (sc.hasNextDouble()){
            double input = sc.nextDouble();
            if (input<smallest){
                smallest=input;
            }
        }
        System.out.println(smallest);
    }

}
