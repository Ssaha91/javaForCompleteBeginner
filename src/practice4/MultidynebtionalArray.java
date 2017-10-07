package practice4;

public class MultidynebtionalArray {

    public static void main(String[] args) {
        int[][] num = {
                {2,5,8,10},
                {11,33},
                {55,46,77}
        };
        System.out.println(num[1][1]);
        String[][] songs = new String[2][3];
        songs[0][1] = "Arijit Sing";
        songs[1][0] = "Kumar Sanu";
        System.out.println(songs[1][0]);

        for (int row=0; row<num.length; row++){
            for (int col=0; col<num[row].length; col++){
                System.out.print(num[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
