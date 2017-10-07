package algorithom;
import java.util.Scanner;
public class OddNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("plese enster the limit number : ");
            int num = sc.nextInt();
            int limit=50;
            for (int i = 1; i<=num; i++){
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        }
    }

