import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLen = scanner.nextInt();
        int[] array = new int[arrayLen];
        int max_val = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arrayLen; i++){
            array[i] = scanner.nextInt();

            if (i == 0 || array[i] > max_val) {
                max_val = array[i];
                index = i;
            }

        }

        System.out.println(index);;
    }
}