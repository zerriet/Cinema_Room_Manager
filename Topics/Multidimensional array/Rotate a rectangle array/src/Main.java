import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] twoDimArray = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int[][] newTwoDimArray = new int[col][row];

        for (int k = 0; k < col; k++) {
            for (int l = 0; l < row; l++) {
                newTwoDimArray[k][l] = twoDimArray[row - 1 - l][k];
                System.out.print(newTwoDimArray[k][l] + " ");
            }
            System.out.println();
        }


    }
}