import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayDim = scanner.nextInt();
        int[][] twoDimArray = new int[arrayDim][arrayDim];

        for (int i = 0; i< arrayDim; i++) {
            for (int j = 0; j < arrayDim; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        /*for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }*/

        boolean symmetricTestFailed = false;

        for (int i = 0; i< arrayDim; i++) {
            for (int j = 0; j < arrayDim; j++) {
                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    //System.out.println(twoDimArray[i][j]);
                    symmetricTestFailed = true;
                    break;
                }
            }
        }

        if (symmetricTestFailed == true) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}