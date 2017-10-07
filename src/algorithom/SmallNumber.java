package algorithom;

import java.util.ArrayList;

public class SmallNumber {
    public static void main(String[] args) {
       int[] num = {10, 77, 2222, 8, 5, 6};
       int smallest, largest;
       smallest = num[0];
       largest = num[0];
       for (int i = 1; i<num.length; i++){
            if (num[i]>largest){
                largest=num[i];
            }else if(num[i]<smallest){
                smallest=num[i];
           }
       }
        System.out.println("largest elements in the list " + largest);
        System.out.println("smallest elements in the list " + smallest);
    }
}
