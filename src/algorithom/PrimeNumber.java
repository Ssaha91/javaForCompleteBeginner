package algorithom;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            boolean num = true;
            for (int j = 2; j<=i-1; j++){
                if (i%j==0){
                    num=false;
                    break;
                }
            }
            if (num==true){
                System.out.println(i);
            }
        }
    }
}
