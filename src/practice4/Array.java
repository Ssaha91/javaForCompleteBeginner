package practice4;

import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        int[] num = {33, 44, 55, 66, 99, 77};
        //System.out.println(num[2]);

//        for (int i = 0; i<num.length; i++){
//            System.out.println(i);
//        }
//        Iterator itr = al.iterator();
//        while(itr.hasNext()) {
//
//            Object element = itr.next();
//            System.out.print(element + " ");
//
//        }

        for (int a: num) {
            System.out.println(a);
        }
    }

}
