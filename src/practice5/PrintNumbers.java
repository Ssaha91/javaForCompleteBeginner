package practice5;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        String text = "Brown fox is the best animal in that zoo";
        StringBuilder sb = new StringBuilder("Brown fox is the best animal in that zoo");
        sb.append("Brown fox is the best animal in that zoo").reverse().indexOf(text);
        System.out.println(sb);
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(642);
//        arr.add(542);
//        arr.add(777);
//        arr.add(585);
//        System.out.println(findLargeNumber(arr));
//
//        Scanner sc = new Scanner((System.in));
//        System.out.println("plz enter your grade");
//        int num = sc.nextInt();
//        System.out.println(letterGrade(num));

        //printNumber(53, 89);
//        for (int x : printNumber(40, 60)) {
//            System.out.println(x);
//        }

        //divisibleNumber(31);
    }
//    public static void printNumber(int start, int end){
//        for (int i = start; i<=end; i++ ){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }
//    }

        public static ArrayList<Integer> printNumber(int start, int end){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start; i<=end; i++ ){
            if (i%2==0){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean divisibleNumber(int a) {
        if (a % 3 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return true;
    }

    public static  char letterGrade(int avg){
        if (avg >= 90){
                return 'A';
        }
        if (avg >= 80){
            return 'B';
        }
        if (avg >= 70){
            return 'C';
        }
        if (avg >= 60){
            return 'D';
        }else{
            return 'F';
        }

    }

    public static int  findLargeNumber(ArrayList<Integer> arr){
        int max = arr.get(0);
        for (int i = 0; i<arr.size(); i++){
            if ( arr.get(i)> max){
                max = arr.get(i);
            }
        }
        return max;
    }
}
